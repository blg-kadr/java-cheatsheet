# Java Backend Engineering Cheatsheet

## Basic Java Concepts
- **Variables and Data Types**: Primitive types (int, boolean, etc.), reference types (String, Arrays).
- **Control Structures**: if, switch, loops (for, while).
- **Object-Oriented Programming**: Classes, Objects, Inheritance, Polymorphism, Encapsulation.
- **Java Collections**: List, Set, Map. Lists can be iterated over using `for-each` or Streams.

## Spring Boot
- **Getting Started**: Use Spring Initializr to bootstrap a Spring Boot application.
  ```java
  @SpringBootApplication
  public class Application {
      public static void main(String[] args) {
          SpringApplication.run(Application.class, args);
      }
  }
  ```
- **Configuration**: Use `application.properties` or `application.yml` to set properties.

## Spring Data JPA
- **Entities**: Define entities with `@Entity` annotation.
  ```java
  @Entity
  public class User {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      private String name;
  }
  ```
- **Repositories**: Extend `JpaRepository`.
  ```java
  public interface UserRepository extends JpaRepository<User, Long> {}
  ```

## REST API Development
- **Creating REST Controllers**: Use `@RestController` and map methods with `@GetMapping`, `@PostMapping`.
  ```java
  @RestController
  @RequestMapping("/api/users")
  public class UserController {
      @GetMapping
      public List<User> getAllUsers() {
          return userService.findAll();
      }
  }
  ```
- **Response Entity**: Use `ResponseEntity` to customize HTTP responses.

## Security
- **Authentication**: Use Spring Security to secure endpoints.
- **JWT**: Implement JWT for stateless authentication.

## Testing
- **Unit Testing**: Use JUnit for unit tests.
  ```java
  @SpringBootTest
  public class UserServiceTest {
      @Test
      public void testFindAllUsers() {
          List<User> users = userService.findAll();
          assertNotNull(users);
      }
  }
  ```

## DTOs (Data Transfer Objects)
- Use DTOs to transfer data and avoid exposing entities directly.

## Validation
- Use `@Valid` and `@NotNull` annotations for validation.

## Exception Handling
- Customize exception handling via `@ControllerAdvice`.
  ```java
  @ControllerAdvice
  public class GlobalExceptionHandler {
      @ExceptionHandler(ResourceNotFoundException.class)
      public ResponseEntity<Object> handleNotFound(ResourceNotFoundException ex) {
          return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
      }
  }
  ```

## Collections
- Learn how to efficiently use collections and their methods.

## Streams
- Utilize Java Streams to streamline data processing.
  ```java
  List<String> userNames = users.stream()
      .map(User::getName)
      .collect(Collectors.toList());
  ```

## Design Patterns
- Familiarize yourself with Singleton, Factory, and Observer patterns.

## Logging
- Use SLF4J with Logback for logging.
  ```java
  @Slf4j
  public class UserService {
      public void createUser(User user) {
          log.info("Creating user: {}", user);
      }
  }
  ```

## Pagination
- Implement pagination in Spring Data JPA with `Pageable`.
- Example: `Page<User> users = userRepository.findAll(PageRequest.of(page, size));`

## Async Processing
- Use `@Async` for asynchronous methods.

## Caching
- Implement caching using annotations `@Cacheable`, `@CachePut`, and `@CacheEvict`.

## Best Practices
- Follow SOLID principles.
- Write clean and maintainable code.
- Use proper error handling and logging practices.