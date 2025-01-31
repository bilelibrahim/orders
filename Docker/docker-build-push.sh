#!/usr/bin/env bash

# Usage (from root of project): sh ./Docker/ld-push.sh

./gradlew clean build
docker build -f Docker/Dockerfile --no-cache -t bilel/orders:gke-2.2.0 .
docker push bilel/orders:gke-2.2.0

# docker run --name orders -d bilel/orders:gke-2.2.0