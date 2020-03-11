DESCRIPTION = "Simple hello-make application"

S = "${TOPDIR}/../hello-make"
D = "${WORKDIR}"

do_build() {
    bbnote "do_build"
    do_compile
    do_install
}

do_compile() {
    bbnote "do_compile"
    cd ${S}
    make
}

do_install() {
    bbnote "do_install"
    #install -d ${D}${bindir}
    install -m 0755 ${S}/hello-make ${D}
}

do_clean() {
    bbnote "do_clean"
    cd ${S}
    make clean
}

addtask compile  after do_build
addtask install  after do_build
addtask clean    after do_build
