FROM openjdk:17
EXPOSE 8080
ADD target/cicd_github_action.jar cicd_github_action.jar
ENTRYPOINT ["java","-jar","cicd_github_action.jar"]