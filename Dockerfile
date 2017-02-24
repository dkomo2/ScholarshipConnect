FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp

ADD build/libs/ScholarshipConnect-0.0.1.jar app.jar
RUN sh -c 'touch /app.jar'

ENTRYPOINT ["java", "-jar", "/app.jar"]
