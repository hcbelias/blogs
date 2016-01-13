#!/usr/bin/env bash
JAVA_HOME=/usr/lib/jvm/java-8-oracle
export JAVA_HOME
echo "JAVA_HOME=$JAVA_HOME"
./gradlew clean
./gradlew build
