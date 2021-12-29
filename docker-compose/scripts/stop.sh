#!/bin/bash
SCRIPT_DIR=$(dirname "$0")
source ${SCRIPT_DIR}/set-env.sh

$(${DOCKER_COMPOSE_CMD_PREFIX} down --remove-orphans)
exit 0