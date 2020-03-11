FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/arifactsample.jar arifactsample.jar
ENTRYPOINT ["java","-jar","arifactsample.jar"]