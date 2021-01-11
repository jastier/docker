# This container will be a netcat client on local host port 8080

# use this image
FROM ubuntu

# install what we need
RUN apt-get update
RUN apt-get install -y netcat

# At this point create a dummy user so we don't run as root
RUN groupadd -g 999 appuser && \
    useradd -r -u 999 -g appuser appuser
USER appuser

# start here
ENTRYPOINT netcat -l 8080
