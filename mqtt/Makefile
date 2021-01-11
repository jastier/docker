# Build and start a Mosquitto broker in a Docker container.
#
# A docker network is needed.   Build it only if it does not already exist.

# the following variable names are arbitrary
port := 1883
network := "test_network"  
image :="mqtt_broker_image"
container :="mqtt_broker_container"

all:
	make build run

.PHONY: build
build:
	docker build .  -t $(image)

.PHONY: run
run:
	docker run --net=$(network) -p $(port):$(port) $(image) --name=$(container)

.PHONY: net
net:
	docker network create --driver bridge $(network)
