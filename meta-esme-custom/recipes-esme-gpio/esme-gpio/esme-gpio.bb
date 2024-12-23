# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
inherit pkgconfig
inherit update-rc.d
INITSCRIPT_PACKAGES = "$PN"
INITSCRIPT_PARAMS = "defaults"
INITSCRIPT_NAME = "esme-led"
DEPENDS += "libgpiod (<2.0)"


# No information for SRC_URI yet (only an external source tree was specified)
SRC_URI = "https://github.com/dianegerbaulet/gpio-toggle.git \
           file://0006-Makefile-modification.patch \
           file://0004-initial-esme-led-startup-script.patch \
           file://0002-initial-version-of-esme-led-startup-script.patch \
           file://0007-initial-version-of-gpio-program.patch \
           file://0003-install-esme-led-startup-script.patch \
           file://0001-initial-version-of-gpio-program.patch \
           file://0005-Makefile-and-gpiod-modification.patch \
           "


# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake
}

do_install () {
	# This is a guess; additional arguments may be required
	oe_runmake INSTALL_DIR=${D} install
}

  
