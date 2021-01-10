# Test the ability of a docker container to write to the terminal stdout
# Docker also writes the stdout of a container to a logfile.   Read it with:
# docker logs <containerID>   

# copy this image
FROM ubuntu

# start here
ENTRYPOINT while (true) do \
  echo "Docker container stdout"; \
  sleep 5; \
done

