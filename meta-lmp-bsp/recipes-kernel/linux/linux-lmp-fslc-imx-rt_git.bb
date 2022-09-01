FILESEXTRAPATHS:prepend := "${THISDIR}/linux-lmp-fslc-imx:"

include linux-lmp-fslc-imx_git.bb

KERNEL_REPO = "git://github.com/foundriesio/linux.git"
LINUX_VERSION = "5.10.90"
KERNEL_BRANCH = "5.10-2.1.x-imx-rt"

SRCREV_machine = "fcae15dfd58d61c6587298cf4456358d201fab1b"
LINUX_KERNEL_TYPE = "preempt-rt"

SRC_URI:append:imx6ullevk = " \
    file://imx6ullevk-preempt-rt.scc \
"
