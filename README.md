# Come pacchettizzare l'app
`./mvnw package` 

oppure usare il tool "Maven" di IntelliJ

# Come avviare l'app da terminale
`java -jar target/SPikeTAASS-0.0.1-SNAPSHOT.jar`

# Come dockerizzare il backend
`docker build -t spiketaass/backend .`

# Come avviare il container
`docker run -p 8080:8080 spiketaass/backend`

# Come fare tutto in una sola volta
``
./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=spiketaass/backend
``


