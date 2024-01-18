SUMMARY = "Aktualizr SOTA Client (Uptane)"
DESCRIPTION = "SOTA Client application written in C++"
HOMEPAGE = "https://github.com/uptane/aktualizr"
SECTION = "base"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

DEPENDS = "boost curl openssl libarchive libsodium sqlite3 asn1c-native ostree"
RDEPENDS:${PN}:class-target = "lshw"
RRECOMMENDS:${PN}_class-target = "${PN}-hwid"

PV = "1.0+git${SRCPV}"
PR = "7"

GARAGE_SIGN_PV = "0.7.4-25-g7cfca74"

SRC_URI = " \
  gitsm://github.com/uptane/aktualizr;branch=${BRANCH};name=aktualizr;protocol=https \
  ${@ d.expand("https://tuf-cli-releases.ota.here.com/cli-${GARAGE_SIGN_PV}.tgz;unpack=0;name=garagesign") if not oe.types.boolean(d.getVar('GARAGE_SIGN_AUTOVERSION')) else ''} \
  file://0001-Support-statically-linked-aktualizr-primary.patch \
  file://0001-Only-install-aktualizr-primary.patch \
  "

SRC_URI[garagesign.md5sum] = "584cd16aa7824e34b593dae63796466b"
SRC_URI[garagesign.sha256sum] = "c7d5fdceef3e815363e3aa398c38643ca213f9b7f66d50f55c76a66cb74565d2"

SRCREV = "eced3900754b51273733c66588ca44c44ba03b2c"
BRANCH ?= "master"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

EXTRA_OECMAKE = "-DCMAKE_BUILD_TYPE=Release -DBUILD_OSTREE=ON"

GARAGE_SIGN_OPS = "${@ d.expand('-DGARAGE_SIGN_ARCHIVE=${WORKDIR}/cli-${GARAGE_SIGN_PV}.tgz') if not oe.types.boolean(d.getVar('GARAGE_SIGN_AUTOVERSION')) else ''}"
PKCS11_ENGINE_PATH = "${libdir}/engines-3/pkcs11.so"

PACKAGECONFIG ?= ""
PACKAGECONFIG:class-native = "sota-tools"
PACKAGECONFIG[warning-as-error] = "-DWARNING_AS_ERROR=ON,-DWARNING_AS_ERROR=OFF,"
PACKAGECONFIG[hsm] = "-DBUILD_P11=ON -DPKCS11_ENGINE_PATH=${PKCS11_ENGINE_PATH},-DBUILD_P11=OFF,libp11,"
PACKAGECONFIG[sota-tools] = "-DBUILD_SOTA_TOOLS=ON ${GARAGE_SIGN_OPS},-DBUILD_SOTA_TOOLS=OFF,glib-2.0,"
PACKAGECONFIG[load-tests] = "-DBUILD_LOAD_TESTS=ON,-DBUILD_LOAD_TESTS=OFF,"
PACKAGECONFIG[serialcan] = ",,,slcand-start"
PACKAGECONFIG[ubootenv] = ",,u-boot-fw-utils,u-boot-fw-utils aktualizr-uboot-env-rollback"

do_install:append () {
    if ${@bb.utils.contains('PACKAGECONFIG', 'sota-tools', 'true', 'false', d)}; then
        install -m 0755 ${B}/src/sota_tools/garage-sign/bin/* ${D}${bindir}
        install -m 0644 ${B}/src/sota_tools/garage-sign/lib/* ${D}${libdir}
    fi
}

PACKAGES =+ "${PN}-sotatools-lib"

FILES:${PN} = "${bindir}/aktualizr"
FILES:${PN}-sotatools-lib = "${libdir}/libsota_tools.so"

BBCLASSEXTEND = "native"
