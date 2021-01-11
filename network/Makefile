# Build and start a netcat docker image that can then be connected to
# from a shell with:  netcat 127.0.0.1 8080
#
# A docker network is needed.   Build it only if it does not already exist.

# the following variable names are arbitray
port := 8080
network := "test_network"  
image :="netcat_client"

all:
	make build run

.PHONY: build
build:
	docker build -f ./client/Dockerfile .  -t $(image)

.PHONY: run
run:
	docker run --net=$(network) -p $(port):$(port) $(image) --name=client

.PHONY: net
net:
	docker network create --driver bridge $(network)
