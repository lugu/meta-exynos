require linux.inc

DESCRIPTION = "Linux kernel"
KERNEL_IMAGETYPE ?= "zImage"

COMPATIBLE_MACHINE = "chromebook-snow"

FILESPATH =. "${FILE_DIRNAME}/linux-exynos-${PV}:${FILE_DIRNAME}/linux-exynos-${PV}/${MACHINE}:"

S = "${WORKDIR}/git"

PV = "4.14-rc7"
PR = "r1"

SRC_URI = "git://github.com/torvalds/linux.git"
SRCREV_pn-${PN} = "0b07194bb55ed836c2cc7c22e866b87a14681984"

SRC_URI += " \
             file://defconfig \
             file://0001-exynos5250-snow-dummy-tpm-in-dts-for-u-boot.patch \
            "
