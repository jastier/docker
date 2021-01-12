# Test the ability of a docker container to write to the terminal.  
# Docker will also create a logfile when this container is run, see it with:
# docker logs <CONTAINER ID>

# use this image
FROM ubuntu

# Create a user so the container does not run the process as root
RUN groupadd -g 999 appuser && \
    useradd -r -u 999 -g appuser appuser
USER appuser

# start here
ENTRYPOINT echo "Hello World!"
