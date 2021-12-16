# traefik-mirroring-poc
Test how traefik mirroring feature works

Steps:
1. Run mvn package inside demo folder.. It creates the jar with the spring boot application, where it has an endpoint "test" with a sleep inside
2. Run the docker-compose of the root folder
3. Call the endpoint in traefik --> GET http://localhost:8083/test
