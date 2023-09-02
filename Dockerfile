FROM openjdk:17-jdk
VOLUME /tmp
COPY uno.service/build/libs/uno.service.jar app.jar
CMD ["sh","-c","java -jar app.jar"]