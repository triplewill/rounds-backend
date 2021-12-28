#!/bin/bash
SCRIPT_DIR=$(dirname "$0")

DOCKER_COMPOSE_CMD_PREFIX="docker-compose \
  -f ${SCRIPT_DIR}/../infra/db.yml "
