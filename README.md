##1. Spring Boot##
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
What is Spring Boot?
------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Spring Boot is a framework built on top of the Spring Framework that makes it easy to create standalone, production-ready Java applications with minimal configuration.
It removes boilerplate code and provides auto-configuration, so developers can focus on business logic instead of setup.


Why Spring Boot?

🚀 Rapid application development
⚙️ Auto-configuration (no XML required)
📦 Embedded servers (Tomcat, Jetty)
🔐 Easy integration with databases, security, REST, GraphQL, etc.
🧪 Production-ready features (Actuator, metrics, health checks)

Key Features of Spring Boot
Feature	                | Description
Auto Configuration	    | Automatically configures beans based on dependencies
Starter Dependencies	  | Predefined dependencies like spring-boot-starter-web
Embedded                | Server	No need to deploy WAR files
Spring Actuator	        | Monitoring and health endpoints
Externalized            | Config	Config via application.properties/yml

Example (Spring Boot REST API)
@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public List<String> getUsers() {
        return List.of("Sumant", "Rahul", "Amit");
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

##2. GraphQL##
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
What is GraphQL?

GraphQL is a query language for APIs and a runtime that allows clients to request exactly the data they need—nothing more, nothing less.
It was developed by Facebook (Meta).

Why GraphQL?
🎯 Avoids over-fetching and under-fetching
📱 Single endpoint instead of multiple REST endpoints
🔄 Strongly typed schema
⚡ Faster and flexible for frontend applications

Core GraphQL Concepts
Concept	              |Description
Schema	              |Defines API structure
Query	                |Used to fetch data
Mutation	            |Used to create/update/delete data
Resolver	            |Maps GraphQL queries to backend logic
Type	                |Defines object structure


Example GraphQL Schema
type User {
  id: ID!
  name: String!
  email: String!
}

type Query {
  getUsers: [User]
}


Example GraphQL Query
query {
  getUsers {
    name
    email
  }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


3. Spring Boot + GraphQL
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
How Spring Boot Works with GraphQL
Spring Boot provides official support for GraphQL via:
spring-boot-starter-graphql
GraphQL APIs are exposed via a single endpoint:

Copy code
POST /graphql

GraphQL Resolver in Spring Boot
@Controller
public class UserResolver {

    @QueryMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}


Flow: Spring Boot + GraphQL
Client → GraphQL Query
        → Spring Boot Controller (@QueryMapping)
        → Service Layer
        → Repository (JPA/Hibernate)
        → Database
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


4. Spring Boot vs REST vs GraphQL
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------   
Feature	           | REST	             | GraphQL
Endpoints          |	Multiple	       | Single
Data Fetching	     | Fixed response	   | Client-driven
Versioning	       | Required	         | Not needed
Performance        | Can overfetch	   | Optimized

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
5. Use Cases
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Complex data relationships (User → Orders → Products)
Frontend-heavy apps (React, Angular)
Microservices APIs
Mobile applications

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
6. Summary
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Spring Boot simplifies Java backend development
GraphQL provides flexible and efficient data fetching
Spring Boot + GraphQL is powerful for modern APIs
Ideal for scalable, frontend-friendly applications
