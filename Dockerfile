FROM openjdk:latest
MAINTAINER Prajyoth Bhandary
ADD target/smart-university-portal.jar /default/smart-university-portal.jar
USER root
RUN chown root:root /default
RUN chmod 777 /default
EXPOSE 8080
CMD ["java","-jar","/default/smart-university-portal.jar"]