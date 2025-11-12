# Java Cheatsheet

## Introduction  
This cheatsheet is designed for backend engineering with Java and highlights core concepts especially using Spring Boot.

## Basic Java  
- **Variables**: Used to store data.
- **Control Statements**: if, switch, loops to control flow.
- **OOP Concepts**: Classes, Inheritance, Polymorphism.

## Spring Boot & Dependency Injection  
Spring Boot simplifies dependency injection. Here's an example:
```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

## REST API Development  
To create a REST API:
```java
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
```

## Spring Data JPA & Database  
JPA manages data persistence. Here's how to define an entity:
```java
import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
```

### Entity Relationships  
```java
@Entity
public class Post {
    @ManyToOne
    private User author;
}
```

### Transactions  
```java
import org.springframework.transaction.annotation.Transactional;

@Transactional
public void createPost(Post post) {
    // save logic
}
```

## DTOs & Mappers  
Data Transfer Objects (DTOs) are used to transfer data. You typically create a mapper to convert between Entity and DTO.

## Validation & Exception Handling  
Use annotations like `@Valid` for validation. Handle exceptions with `@ControllerAdvice`.

## Spring Security & JWT  
Spring Security helps in securing APIs. Here's a basic configuration:
```java
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
            .anyRequest().authenticated();
    }
}
```

## Layered Architecture Patterns  
Use layers for organization: Controller, Service, Repository.

## Testing with JUnit & Mockito  
```java
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyServiceTest {
    @Test
    public void testService() {
        MyService service = mock(MyService.class);
        when(service.doSomething()).thenReturn("result");
    }
}
```

## Gradle Multi-module Projects  
Essentials of structuring Gradle projects into modules.

## Docker & Deployment  
Leveraging Docker to containerize Spring applications.

## Best Practices  
- Follow SOLID principles.
- Use version control for your projects.
- Write meaningful tests.