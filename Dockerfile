FROM gradle:8-jdk21
EXPOSE 8080
COPY build/libs/*.jar /app.jar
CMD java -Duser.timezone=UTC -XX:+UseContainerSupport -XX:MaxRAMPercentage=75 -jar /app.jar