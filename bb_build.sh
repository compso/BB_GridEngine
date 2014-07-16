#!/bin/bash
#
#
#	basic compiler script for building Grid Engine
#
#
dir=`dirname $0`

export GE_DEPENDECIES_PATH=/net/pinot/disk1/playpen/dev/OpenGridScheduler/3rdparty

export JAVA_HOME=${GE_DEPENDECIES_PATH}/jdk1.6.0_39
export ANT_HOME=${GE_DEPENDECIES_PATH}/apache-ant-1.8.4
export CLASSPATH=${GE_DEPENDECIES_PATH}/junit-4.10.jar:${ANT_HOME}/lib/ant.jar
export JUNIT_JAR=${GE_DEPENDECIES_PATH}/junit-4.10.jar
export PATH=$PATH:$JAVA_HOME/bin:$ANT_HOME/bin

cd "$dir/source"
./aimk -no-gui-inst -only-depend 
./scripts/zerodepend
./aimk -no-gui-inst -shared-libs depend
./aimk -no-gui-inst -shared-libs

echo
echo "#-------------- Build Complete ---------------#"
echo "#--------- Starting Package Creation ----------#"
echo

version=`cat libs/gdi/version.c |grep "char GDI_VERSION"|awk -F "[\",]" '{print $2}'`

export SGE_ROOT=$PWD/../DIST/$version
mkdir -p $SGE_ROOT
scripts/distinst -all -local -noexit

echo "#------------- Package Finished --------------#"

