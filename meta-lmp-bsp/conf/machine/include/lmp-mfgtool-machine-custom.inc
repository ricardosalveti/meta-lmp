# Embedded Artists i.MX7ULP COM
PREFERRED_PROVIDER_virtual/kernel_imx7ulpea-ucom = "linux-lmp-dev-mfgtool"
KERNEL_REPO_imx7ulpea-ucom ?= "git://github.com/foundriesio/linux.git"
LINUX_VERSION_imx7ulpea-ucom ?= "4.19.y"
KERNEL_BRANCH_imx7ulpea-ucom ?= "linux-ea-v4.19.y"
PREFERRED_VERSION_u-boot-fio-mfgtool_imx7ulpea-ucom ?= "2020.04"
PREFERRED_PROVIDER_virtual/bootloader_imx7ulpea-ucom = "u-boot-fio-mfgtool"
PREFERRED_PROVIDER_u-boot_imx7ulpea-ucom = "u-boot-fio-mfgtool"
PREFERRED_PROVIDER_u-boot-default-script_imx7ulpea-ucom = "u-boot-ostree-scr-fit"
UBOOT_CLASSES_imx7ulpea-ucom = "uboot-fitimage"
IMAGE_BOOT_FILES_imx7ulpea-ucom = "boot.itb SPL u-boot.itb"
KERNEL_IMAGETYPE_imx7ulpea-ucom = "fitImage"
KERNEL_CLASSES_imx7ulpea-ucom = " kernel-lmp-fitimage "

# iMX6ULL
PREFERRED_PROVIDER_virtual/kernel_mx6ull = "linux-lmp-dev-mfgtool"
KERNEL_REPO_mx6ull ?= "git://source.codeaurora.org/external/imx/linux-imx.git"
LINUX_VERSION_mx6ull ?= "5.4.y"
KERNEL_BRANCH_mx6ull ?= "imx_5.4.24_2.1.0"
PREFERRED_VERSION_optee-os-fio-mfgtool_mx6ull = "3.10.0+git"
PREFERRED_VERSION_u-boot-fio-mfgtool_mx6ull ?= "2020.04"
PREFERRED_PROVIDER_virtual/bootloader_mx6ull = "u-boot-fio-mfgtool"
PREFERRED_PROVIDER_u-boot_mx6ull = "u-boot-fio-mfgtool"
PREFERRED_PROVIDER_u-boot-default-script_mx6ull = "u-boot-ostree-scr-fit"
UBOOT_CLASSES_mx6ull = "uboot-fitimage"
IMAGE_BOOT_FILES_remove_mx6ull = "boot.scr uEnv.txt zImage"
IMAGE_BOOT_FILES_append_mx6ull = " boot.itb SPL u-boot.itb"
KERNEL_IMAGETYPE_mx6ull = "fitImage"
KERNEL_CLASSES_mx6ull = " kernel-lmp-fitimage "

# iMX8MM
PREFERRED_VERSION_optee-os-fio-mfgtool_mx8mm = "3.10.0+git"
PREFERRED_VERSION_u-boot-fio-mfgtool_mx8mm ?= "2020.04"
PREFERRED_PROVIDER_virtual/bootloader_mx8mm = "u-boot-fio-mfgtool"
PREFERRED_PROVIDER_u-boot_mx8mm = "u-boot-fio-mfgtool"
PREFERRED_PROVIDER_u-boot-default-script_mx8mm = "u-boot-ostree-scr"
KERNEL_IMAGETYPE_mx8mm = "fitImage"
KERNEL_CLASSES_mx8mm = " kernel-lmp-fitimage "

# Apalis-iMX6
PREFERRED_PROVIDER_virtual/kernel_apalis-imx6 = "linux-lmp-dev-mfgtool"
KERNEL_REPO_apalis-imx6 ?= "git://github.com/foundriesio/linux.git"
LINUX_VERSION_apalis-imx6 ?= "5.4.y"
KERNEL_BRANCH_apalis-imx6 ?= "linux-v5.4.y"
PREFERRED_VERSION_optee-os-fio-mfgtool_apalis-imx6 = "3.10.0+git"
PREFERRED_VERSION_u-boot-fio-mfgtool_apalis-imx6 ?= "2020.04"
PREFERRED_PROVIDER_virtual/bootloader_apalis-imx6 = "u-boot-fio-mfgtool"
PREFERRED_PROVIDER_u-boot_apalis-imx6 = "u-boot-fio-mfgtool"
PREFERRED_PROVIDER_u-boot-default-script_apalis-imx6 = "u-boot-ostree-scr-fit"
UBOOT_CLASSES_apalis-imx6 = "uboot-fitimage"
IMAGE_BOOT_FILES_apalis-imx6 = "boot.itb SPL u-boot.itb"
KERNEL_IMAGETYPE_apalis-imx6 = "fitImage"
KERNEL_CLASSES_apalis-imx6 = " kernel-lmp-fitimage "

# Apalis-iMX8
PREFERRED_VERSION_u-boot-fio-mfgtool_apalis-imx8 ?= "2020.04"
PREFERRED_PROVIDER_virtual/bootloader_apalis-imx8 = "u-boot-fio-mfgtool"
PREFERRED_PROVIDER_u-boot_apalis-imx8 = "u-boot-fio-mfgtool"
PREFERRED_PROVIDER_u-boot-default-script_apalis-imx8 = "u-boot-ostree-scr-fit"
KERNEL_IMAGETYPE_apalis-imx8 = "fitImage"
KERNEL_CLASSES_apalis-imx8 = " kernel-lmp-fitimage "
