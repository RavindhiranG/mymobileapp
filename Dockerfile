FROM eclipse-temurin:17
COPY target/mymobileapp.jar mymobileapp.jar
CMD [ "java","-jar","mymobileapp.jar" ]