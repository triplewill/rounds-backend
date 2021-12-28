#!/bin/bash
SCRIPT_DIR=$(dirname "$0")
source ${SCRIPT_DIR}/set-env.sh

${SCRIPT_DIR}/build-images.sh
${DOCKER_COMPOSE_CMD_PREFIX} up -d --remove-orphans