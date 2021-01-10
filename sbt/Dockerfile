# First test.  

# copy this image
FROM ubuntu

# blame
MAINTAINER jastier@email.arizona.edu

# applications
RUN apt-get update
RUN apt-get install -y mosquitto
RUN apt-get install -y scala
RUN apt-get install -y curl
RUN apt-get install -y unzip
RUN apt-get install -y zip
RUN curl -s "https://get.sdkman.io" | bash
UN sdk install -y sbt

# SBT install needs sdkman first
#RUN source ~/.bashrc


# socket for the broker (private network bridge goes here)
EXPOSE 1883

# test of stdout connection to VM
CMD echo "Hello Mosquitto!"

ENTRYPOINT sbt "runMain org.clulab.asist.DialogAgentTest"

