Setup and run

1. [Install docker](https://docs.docker.com/get-docker/)
2. Verify docker installed. CLI command 'docker --version'
3. Pull project and update all dependencies
4. Execute command "docker pull selenoid/firefox:110.0" 
5. Execute command "docker run -d --name selenoid -p 4444:4444 -v ~/.aerokube/selenoid:/etc/selenoid:ro -v /var/run/docker.sock:/var/run/docker.sock aerokube/selenoid:latest-release"
6. Verify Selenoid is up "http://localhost:4444/status"
7. Execute command "mvn clean test"