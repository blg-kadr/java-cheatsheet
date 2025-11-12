# Comprehensive Java Backend Engineering Cheatsheet

## 1. Basic Java

### Variables
```java
int number = 10;
String message = "Hello, World!";
```

### Control Flow
```java
if (number > 5) {
    System.out.println("Number is greater than 5");
} else {
    System.out.println("Number is 5 or less");
}
```

### OOP
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
```

## 2. Spring Boot Fundamentals

### Dependency Injection
```java
@Service
public class MyService {
    @Autowired
    private MyRepository myRepository;
}
```

### Configuration
```properties
# application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=pass
```

### Profiles
```java
@Profile("dev")
@Component
public class DevConfig {...}
```

## 3. REST API Development

### Controller Examples
```java
@RestController
@RequestMapping("/api")
public class MyController {
    @GetMapping("/items/{id}")
    public ResponseEntity<Item> getItem(@PathVariable Long id) {
        return ResponseEntity.ok(itemService.findById(id));
    }

    @PostMapping("/items")
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        return ResponseEntity.created(...).body(itemService.save(item));
    }
}
```

## 4. Spring Data JPA

### Entity Definitions
```java
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;
}
```

### Repository Patterns
```java
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
}
```

## 5. DTOs and Mapping

### DTO Pattern
```java
public class UserDTO {
    private Long id;
    private String name;
}
```

### Manual Mapping
```java
User user = userRepository.findById(id);
UserDTO userDTO = new UserDTO();
userDTO.setId(user.getId());
userDTO.setName(user.getName());
```

### Using MapStruct
```java
@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDTO userToUserDTO(User user);
}
```

## 6. Validation

### Annotations
```java
public class User {
    @NotNull
    private String name;

    @Email
    private String email;
}
```

## 7. Exception Handling

### Global Error Handling
```java
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handleCustomException(CustomException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}
```

## 8. Collections and Streams

### List Example
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
```

### Stream API
```java
List<String> filtered = names.stream()
    .filter(name -> name.startsWith("A"))
    .collect(Collectors.toList());
```

## 9. Spring Security

### Security Configuration
```java
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .anyRequest().authenticated()
            .and().httpBasic();
    }
}
```

### JWT Authentication
```java
public class JwtTokenUtil {...}
```

## 10. Testing

### JUnit 5
```java
@SpringBootTest
public class MyServiceTests {...}
```

### Mockito Example
```java
@Mock
private MyRepository myRepository;
```

## 11. Advanced Patterns

### Builder Pattern
```java
class User {
    private final String name;
    private final int age;

    public static class Builder {
        private String name;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
```

## 12. Logging

### SLF4J Examples
```java
private static final Logger logger = LoggerFactory.getLogger(MyClass.class);
logger.info("Log message");
```

## 13. Pagination and Sorting

### Using Pageable
```java
Pageable pageable = PageRequest.of(0, 10);
Page<User> users = userRepository.findAll(pageable);
```

## 14. Async Processing

```java
@Async
public CompletableFuture<String> asyncMethod() {...}
```

## 15. Caching

```java
@Cacheable("users")
public User getUser(Long id) {...}
```

## 16. Best Practices

- Follow SOLID principles.
- Keep code clean and maintainable.
- Use meaningful variable names.

---

This cheatsheet provides a quick reference for essential Java backend engineering concepts and practices, ensuring developers can build robust applications with Spring Boot and related technologies effectively.



Some useful references
https://introcs.cs.princeton.edu/java/11cheatsheet/?utm_source=chatgpt.com
[@blg-kadr/Java-Cheatsheet-fork](https://yungnickyoung.github.io/Java-Cheatsheet/)
https://cheatography.com/lucamazzza/cheat-sheets/java17/pdf/?last=1696235600
https://www.baeldung.com/java-collections?utm_source=chatgpt.com
