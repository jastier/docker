# Run the mosquitto broker in a docker container

# copy this image
FROM ubuntu

# blame
MAINTAINER jastier@email.arizona.edu

# applications
RUN apt-get update
RUN apt-get install -y mosquitto

# start here
ENTRYPOINT /usr/sbin/mosquitto -c /etc/mosquitto/mosquitto.conf

