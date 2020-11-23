FROM adoptopenjdk/openjdk11:latest
WORKDIR /
ADD ./target/financial-0.0.1-SNAPSHOT.jar financial.jar
EXPOSE 8080
CMD java -jar financial.jar
