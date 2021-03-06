DESCRIPTION = "Simple hello-bazel application"

S = "${TOPDIR}/../hello-bazel"
D = "${WORKDIR}"

do_build() {
    bbnote "do_build"
    do_compile
    do_install
}

do_compile() {
    bbnote "do_compile"
    cd ${S}
    bazel build ...
}

do_install() {
    bbnote "do_install"
    #install -d ${D}${bindir}
    install -m 0755 ${S}/bazel-bin/hello-bazel ${D}
}

do_clean() {
    bbnote "do_clean"
    cd ${S}
    bazel clean
}

addtask compile  after do_build
addtask install  after do_build
addtask clean    after do_build
