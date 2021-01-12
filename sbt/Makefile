# Build a docker image from a Dockerfile in the same directory as this Makefile

image="sbt_image"
container="sbt_container"

all:
	make build run

.PHONY: build
build:
	docker build . -t $(image)

.PHONY: run
run:
	docker run $(image) --name $(container)
