# Run the MQTT publisher
# docker run -p 1883:1883/tcp

# copy this image
FROM ubuntu

# blame
MAINTAINER jastier@email.arizona.edu

# applications
RUN apt-get update
RUN apt-get install -y mosquitto
RUN apt-get install -y mosquitto-clients


# socket to use
EXPOSE 1883

# start here
ENTRYPOINT while (true) do \
  echo "Docker container MQTT publish";\
  mosquitto_pub -t "foo", -m "mqtt from docker container";\
  sleep 5;\
done

