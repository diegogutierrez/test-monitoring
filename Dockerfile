FROM openjdk:11

ARG DEPENDENCY=dependency

COPY ${DEPENDENCY} /usr/src/myapp

WORKDIR /usr/src/myapp

ENTRYPOINT ["java", "-jar", "test-monitoring-0.0.1-SNAPSHOT.jar"]

CMD [""]