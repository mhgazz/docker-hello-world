# Use an official Python runtime as a parent image
FROM websphere-liberty

# Set the working directory to /app
WORKDIR /liberty/wlp/usr/servers/defaultServer/dropins

# Copy the current directory contents into the container at /app
COPY export/Hello-World.war .

# start the server
RUN /liberty/wlp/bin/server start

# Make port 80 available to the world outside this container
EXPOSE 9080

# Define environment variable
#ENV NAME World

# Run
#CMD ["python", "app.py"]