Install bitbake:

    git clone https://github.com/openembedded/bitbake.git

Setup bitbake environment:

    export PATH=$PATH:$PWD/bitbake/bin
    export BBPATH=$PWD/build

Run bitbake command:

    bitbake world

NOTE: alternatively you can also run bitbake like this:

    PATH=$PATH:$PWD/bitbake/bin BBPATH=$PWD/build bitbake world

Clean command:

    bitbake world -c clean
