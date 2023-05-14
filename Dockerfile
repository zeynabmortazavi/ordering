FROM openjdk:17.0.2-oracle
WORKDIR /opt/app
COPY ordering-application/target/ordering-application-0.0.1-SNAPSHOT.jar orderingApp.jar
ENTRYPOINT java -jar orderingApp.jar
