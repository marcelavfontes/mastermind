# Mastermind [![Build Status](https://travis-ci.org/marcelavfontes/mastermind.svg?branch=master)](https://travis-ci.org/marcelavfontes/mastermind)
The idea is to create the "Mastermind" game using spring. The communication to the app will be via endpoints.

What do you need
  - Clone this repository
  - Java 8 JDK
  - Spring boot
  - JUnit 4
  - Install Gradle


How to run
  - Use the command "./gradlew". It will build the project and run all the tests. (For more info, reach https://docs.gradle.org/current/userguide/tutorial_using_tasks.html)
  - To start the application locally, use the command "./gradlew bootRun". (Since this is a Spring boot application. For more info, reach https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-running-your-application.html)

How to deploy
  - Run all the tests (to make sure everything is passing)
  - Push your code (git push origin master)
  - Check Travis-ci to make sure the build is still green (https://travis-ci.org/marcelavfontes/mastermind)
  - If you break the build, please:
        - Do a git reset
        - Fix your code
        - Run the tests to make sure everything is passing
        - Then, send it again!
