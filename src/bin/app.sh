#!/bin/sh
echo "Starting Hello Microservice"
$JAVA_HOME/bin/java $JAVA_OPTS -Ddw.server.connector.port=$PORT -jar lib/*.jar server lib/*.yaml
