FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI_append = " \
    file://0001-imx-Fix-missing-inclusion-of-cdefs.h.patch \
    file://0001-imx-Fix-multiple-definition-of-ipc_handle.patch \
"

SRC_URI_append_toradex = " \
    file://0001-Revert-Add-NXP-s-SoCs-partition-reboot-support.patch \
"
