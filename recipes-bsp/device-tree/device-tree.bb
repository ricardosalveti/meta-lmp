SUMMARY = "Custom BSP device trees"

inherit devicetree

COMPATIBLE_MACHINE_apalis-imx6 = ".*"
SRC_URI_append_apalis-imx6 = " file://imx6q-apalis-custom.dts"
