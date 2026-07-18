# Spring Learn - Hands-on 1 & 4

## Hands-on 1: Create a Spring Web Project using Maven

### Objective
Create a Spring Boot web application using Spring Initializr and Maven.

### Technologies Used
- Java 26
- Spring Boot
- Maven
- Spring Web MVC
- Spring Boot DevTools

### Steps Performed
- Created a Spring Boot project using Spring Initializr.
- Added Spring Web MVC and DevTools dependencies.
- Built the project using Maven.
- Ran the application using `mvn spring-boot:run`.
- Explored the project structure:
  - `src/main/java` – Application source code
  - `src/main/resources` – Configuration files
  - `src/test/java` – Test classes
- Studied `SpringLearnApplication.java` and the `main()` method.
- Explored `pom.xml` and Maven dependency hierarchy.

### Theory
- **@SpringBootApplication** combines:
  - `@SpringBootConfiguration`
  - `@EnableAutoConfiguration`
  - `@ComponentScan`
- `SpringApplication.run()` starts the Spring container and embedded Tomcat server.

---

## Hands-on 4: Load Country from Spring Configuration XML

### Objective
Load a `Country` bean from an XML configuration file using Spring Core.

### Files Created
- `country.xml`
- `Country.java`
- Modified `SpringLearnApplication.java`

### Steps Performed
- Created `country.xml` inside `src/main/resources`.
- Configured a `Country` bean with code and name.
- Implemented `Country` class with:
  - Default constructor
  - Getters & Setters
  - `toString()`
  - Logging
- Loaded the XML using `ClassPathXmlApplicationContext`.
- Retrieved the bean using `context.getBean()`.
- Displayed the country details in the logs.

### Theory
- **Bean:** Object managed by the Spring IoC container.
- **ApplicationContext:** Spring container responsible for creating and managing beans.
- **ClassPathXmlApplicationContext:** Loads Spring configuration from the classpath.
- **context.getBean():** Creates (or retrieves) the configured bean, injects property values, and returns the object.

### Output
```
Country [code=IN, name=India]
```