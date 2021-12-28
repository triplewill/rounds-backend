#!/bin/bash
SCRIPT_DIR=$(dirname "$0")

docker build -t triplewill/skore-postgres -f ${SCRIPT_DIR}/../images/postgres/Dockerfile ${SCRIPT_DIR}/../images/postgres
