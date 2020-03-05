DESCRIPTION = "Simple hello-world application"

S = "${TOPDIR}/../hello-world"
D = "${WORKDIR}"

do_build() {
    #bbnote "do_build"
    do_compile
    do_install
}

do_compile() {
    #bbnote "do_compile"
    #echo "=== do_compile: SRC_URI=${SRC_URI}"
    #echo "=== do_compile:       S=${S}"
    #echo "=== do_compile:       D=${D}"
    #echo "=== do_compile: WORKDIR=${WORKDIR}"
    #echo "=== do_compile:  TOPDIR=${TOPDIR}"
    #echo "=== do_compile: pwd"
    #pwd
    #echo "=== do_compile: cd ${S}"
    cd ${S}
    #echo "=== do_compile: make"
    #make
    #echo "=== do_compile: bazel build ..."
    bazel build ...
}

do_install() {
    #echo "=== do_install:"
    #install -d ${D}${bindir}
    install -m 0755 ${S}/bazel-bin/hello-world ${D}
}

do_clean() {
    #echo "=== do_clean: pwd"
    #pwd
    #echo "=== do_clean: cd ${S}"
    cd ${S}
    #echo "=== do_clean: make clean"
    #make clean
    #echo "=== do_clean: bazel clean"
    bazel clean
}

addtask compile  after do_build
addtask install  after do_build
addtask clean    after do_build
