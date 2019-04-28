FROM ibmjava:8-jre
RUN mkdir -p  /opt/app
WORKDIR /opt/app
COPY target/timeserver-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","timeserver-0.0.1-SNAPSHOT.jar"]