#!/bin/bash

# this script will start a prometheus docker container with the configuration provided in prometheus.yml file
DIR=$(pwd)

echo "current directory: $DIR"

# assuming docker is already installed
docker run \
    -p 9090:9090 \
    -v "$DIR/prometheus.yml":/etc/prometheus/prometheus.yml \
    prom/prometheus
