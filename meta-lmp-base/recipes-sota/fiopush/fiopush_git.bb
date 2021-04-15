DESCRIPTION = "Tool used to push ostree repositories to ostreehub"
HOMEPAGE = "https://github.com/foundriesio/ostreehub"
SECTION = "devel"
LICENSE = "CLOSED"

GO_IMPORT = "github.com/foundriesio/ostreehub"
SRC_URI = "git://${GO_IMPORT}"
SRCREV = "fc9795f0b9d0e3dbfe491d9b0ba14a7397f66b9b"

UPSTREAM_CHECK_COMMITS = "1"

BBCLASSEXTEND = "native"

inherit go-mod

go_do_compile() {
	cd ${B}/src/github.com/foundriesio/ostreehub/cmd/fiopush
	${GO} build ${GOBUILDFLAGS}
}

do_install() {
	install -d ${D}${bindir}
	install ${B}/src/github.com/foundriesio/ostreehub/cmd/fiopush/fiopush ${D}${bindir}
}
