FROM maven:3.6.3-jdk-11-slim AS maven_builder

COPY pom.xml /tmp/
RUN mvn -B dependency:go-offline -f /tmp/pom.xml -s /usr/share/maven/ref/settings-docker.xml
COPY . /tmp
WORKDIR /tmp/
RUN mvn -B -s /usr/share/maven/ref/settings-docker.xml package

# run app
FROM openjdk:11-jre-slim
EXPOSE 8081
RUN mkdir /app
COPY --from=maven_builder /tmp/target/*.jar /app/spring-boot-application.jar
ENTRYPOINT ["java", "-server", "-XX:+UseParallelGC", "-XX:+UseNUMA", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/spring-boot-application.jar"]
