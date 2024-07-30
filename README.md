# Selenium Automation Framework(with Java)
Author  - Pramod Dutta
Website - https:/sdet.live

### Tech Stack of Web Automation

1. Programming - Java ( JDK > 22, IntelliJ)
2. User Interactions, browser Automation Selenium
3. Test Framework -> TestNG
4. Build Management ->  Maven
5. Reporting - Allure Report, Extent Report.
6. Data Driven - DDT Apache POI.
7. CI / CD -> GIT, Jenkins
8. Coding Best Practice-  SonarLint
9. Logs - Log4j
10. Remote Selenium Grid - Cloud Grid, Selenoid

<img width="1024" alt="Screenshot 2023-10-31 at 12 27 14 PM" src="https://github.com/PramodDutta/AdvanceSeleniumFrameworkTTA/assets/1409610/02b0ef3b-1165-46cf-8c9d-89e41b17032f">

`mvn test -Dsurefire.suiteXmlFiles=testng.xml`

<img width="1215" alt="Screenshot 2023-10-31 at 12 27 28 PM" src="https://github.com/PramodDutta/AdvanceSeleniumFrameworkTTA/assets/1409610/b0905741-d88d-4559-93c2-65433e668170">


### Seleniod - Docker Grid Running
- Selenoid is a powerful tool for running Selenium tests in Docker containers.
- which can help you manage and scale your test automation infrastructure more efficiently.



![Screenshot 2024-06-13 at 15 56 21](https://github.com/PramodDutta/ATB5xWebAutomationFramework/assets/1409610/3c957a88-8cf5-4e3c-9134-9fd41fd41d9b)


https://github.com/PramodDutta/ATB5xWebAutomationFramework/assets/1409610/1bd39751-94e8-4f46-91e4-fd79269f6ee6

## How to add Log4J in the Project ?
- Add this to the pom.xml
```<dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-core</artifactId>
      <version>3.0.0-beta2</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api -->
    <dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-api</artifactId>
      <version>3.0.0-beta2</version>
    </dependency> 
```
- Add log4j2.xml in the main folder -> resource
- https://gist.github.com/PramodDutta/36ec0a2460e0ec796b7fe6b186a008b5
- To your Code
```
-     private static final Logger logger = LogManager.getLogger(TestVWOLogin_PF_DM.class);
    
file
logger.info("Starting Test");

```
