# Build a docker image from a Dockerfile in the same directory as this Makefile

name="hello_world"

all:
	make build run

.PHONY: build
build:
	docker build . -t $(name)

.PHONY: run
run:
	docker run $(name)
