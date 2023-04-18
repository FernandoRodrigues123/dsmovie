FROM openjdk:17-jdk-alpine
VOLUME /
EXPOSE 8080
ARG JAR_FILE=target/dsmovie-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

COPY . /
WORKDIR /
RUN javac src/main/java/com/devsuperior/dsmovie/.java
CMD ["java", "Main"]