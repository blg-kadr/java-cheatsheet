# Java Cheatsheet 📚

A comprehensive reference guide for Java programming covering everything from basics to advanced concepts.

## 📖 Overview

This repository contains a complete Java cheatsheet with **30 major sections** covering all essential Java programming concepts, from basic syntax to advanced features like Streams API, Multithreading, and modern Java features.

## 📑 Table of Contents

1. [Basic Syntax & Structure](#1-basic-syntax--structure)
2. [Data Types](#2-data-types)
3. [Variables & Constants](#3-variables--constants)
4. [Operators](#4-operators)
5. [Control Flow Statements](#5-control-flow-statements)
6. [Loops](#6-loops)
7. [Arrays](#7-arrays)
8. [Strings](#8-strings)
9. [Methods (Functions)](#9-methods-functions)
10. [Object-Oriented Programming (OOP)](#10-object-oriented-programming-oop)
11. [Inheritance](#11-inheritance)
12. [Polymorphism](#12-polymorphism)
13. [Abstraction](#13-abstraction)
14. [Interfaces](#14-interfaces)
15. [Encapsulation](#15-encapsulation)
16. [Static Keyword](#16-static-keyword)
17. [Exception Handling](#17-exception-handling)
18. [Collections Framework](#18-collections-framework)
19. [Generics](#19-generics)
20. [Lambda Expressions (Java 8+)](#20-lambda-expressions-java-8)
21. [Streams API (Java 8+)](#21-streams-api-java-8)
22. [File I/O](#22-file-io)
23. [Date and Time (Java 8+)](#23-date-and-time-java-8)
24. [Multithreading](#24-multithreading)
25. [Annotations](#25-annotations)
26. [Enums](#26-enums)
27. [Records (Java 14+)](#27-records-java-14)
28. [Optional (Java 8+)](#28-optional-java-8)
29. [Common Utility Classes](#29-common-utility-classes)
30. [Best Practices & Tips](#30-best-practices--tips)

---

## 🚀 Quick Start

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

---

## 📚 Section Details

### 1. Basic Syntax & Structure
- Class structure
- Comments (single-line, multi-line, JavaDoc)
- Package declarations
- Import statements

### 2. Data Types
- Primitive types: `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`
- Reference types: String, Arrays, Objects
- Type casting (widening and narrowing)

### 3. Variables & Constants
- Variable declaration and initialization
- Constants with `final` keyword
- Variable scope (class, instance, local)

### 4. Operators
- Arithmetic operators (`+`, `-`, `*`, `/`, `%`)
- Assignment operators (`=`, `+=`, `-=`, etc.)
- Comparison operators (`==`, `!=`, `>`, `<`, `>=`, `<=`)
- Logical operators (`&&`, `||`, `!`)
- Ternary operator (`? :`)
- Bitwise operators

### 5. Control Flow Statements
- `if-else` statements
- `switch` statements
- Switch expressions (Java 12+)

### 6. Loops
- `for` loop
- Enhanced `for` loop (for-each)
- `while` loop
- `do-while` loop
- `break` and `continue` statements

### 7. Arrays
- Array declaration and initialization
- Accessing and modifying elements
- Multi-dimensional arrays
- Array utilities (`Arrays.sort()`, `Arrays.toString()`, etc.)

### 8. Strings
- String creation and initialization
- Common String methods
- String comparison
- StringBuilder and StringBuffer
- String formatting

### 9. Methods (Functions)
- Method declaration and syntax
- Method overloading
- Varargs (variable arguments)
- Return types and void methods

### 10. Object-Oriented Programming (OOP)
- Classes and objects
- Constructors (default and parameterized)
- Getters and setters
- `this` keyword
- `toString()` method

### 11. Inheritance
- Extending classes with `extends` keyword
- `super` keyword
- Method overriding
- Parent-child relationships

### 12. Polymorphism
- Method overriding (runtime polymorphism)
- Method overloading (compile-time polymorphism)
- Upcasting and downcasting

### 13. Abstraction
- Abstract classes
- Abstract methods
- Concrete implementations

### 14. Interfaces
- Interface definition with `interface` keyword
- Implementing interfaces
- Default methods (Java 8+)
- Static methods in interfaces (Java 8+)
- Multiple interface implementation

### 15. Encapsulation
- Access modifiers (`public`, `private`, `protected`, default)
- Data hiding
- Getters and setters for controlled access

### 16. Static Keyword
- Static variables (class variables)
- Static methods
- Static blocks
- Static context

### 17. Exception Handling
- `try-catch-finally` blocks
- Try-with-resources (Java 7+)
- Throwing exceptions with `throw` and `throws`
- Custom exceptions
- Common exception types

### 18. Collections Framework
- **List**: `ArrayList`, `LinkedList`
- **Set**: `HashSet`, `TreeSet`, `LinkedHashSet`
- **Map**: `HashMap`, `TreeMap`, `LinkedHashMap`
- **Queue**: `LinkedList`, `PriorityQueue`
- **Stack**: LIFO data structure
- Collections utility methods

### 19. Generics
- Generic classes
- Generic methods
- Bounded type parameters
- Wildcards (`?`, `? extends`, `? super`)

### 20. Lambda Expressions (Java 8+)
- Functional interfaces
- Lambda syntax
- Lambda with collections
- Method references (`::`)

### 21. Streams API (Java 8+)
- Creating streams
- Intermediate operations (`filter`, `map`, `sorted`, etc.)
- Terminal operations (`collect`, `reduce`, `forEach`, etc.)
- Parallel streams

### 22. File I/O
- Reading files (BufferedReader, NIO)
- Writing files (BufferedWriter, NIO)
- File operations (copy, move, delete)
- Path and Paths classes

### 23. Date and Time (Java 8+)
- `LocalDate`, `LocalTime`, `LocalDateTime`
- `ZonedDateTime`
- Date parsing and formatting
- Date arithmetic with `Period` and `Duration`

### 24. Multithreading
- Creating threads (extending `Thread`, implementing `Runnable`)
- Thread methods (`start()`, `sleep()`, `join()`) 
- Synchronization
- Thread safety

### 25. Annotations
- Common annotations (`@Override`, `@Deprecated`, `@SuppressWarnings`)
- `@FunctionalInterface`
- Custom annotations

### 26. Enums
- Basic enum declaration
- Enum with fields and methods
- Using enums in switch statements

### 27. Records (Java 14+)
- Immutable data carriers
- Automatic generation of constructors, getters, `equals()`, `hashCode()`, `toString()`
- Custom constructors in records

### 28. Optional (Java 8+)
- Creating Optional objects
- Checking for values (`isPresent()`, `ifPresent()`)
- Default values (`orElse()`, `orElseGet()`, `orElseThrow()`)
- Transforming values (`map()`, `flatMap()`, `filter()`)

### 29. Common Utility Classes
- **Math**: Mathematical operations
- **Random**: Random number generation
- **Scanner**: User input handling

### 30. Best Practices & Tips
- Naming conventions
- Code organization
- Memory management
- Performance optimization
- Error handling best practices
- OOP principles (SOLID)
- Code quality guidelines
- Testing practices
- Java version features

---

## 🎯 Key Features

✅ **Comprehensive Coverage** - 30 major topics covering all Java essentials  
✅ **Code Examples** - Practical examples for every concept  
✅ **Modern Java** - Includes Java 8+ features (Lambdas, Streams, Optional, etc.)  
✅ **Best Practices** - Industry-standard coding practices and conventions  
✅ **Well-Organized** - Easy-to-navigate structure with clear sections  
✅ **Beginner to Advanced** - Suitable for all skill levels  

---

## 💡 How to Use This Cheatsheet

1. **Learning**: Follow the sections sequentially to learn Java from scratch
2. **Quick Reference**: Jump to specific sections when you need to recall syntax or concepts
3. **Interview Prep**: Review key concepts before technical interviews
4. **Code Review**: Use as a reference for best practices during code reviews

---

## 🔧 Java Version Coverage

This cheatsheet covers:
- ☕ **Java 8**: Lambdas, Streams, Optional, Date/Time API
- ☕ **Java 9**: Modules, JShell
- ☕ **Java 10**: `var` keyword
- ☕ **Java 11**: String methods, Files methods
- ☕ **Java 14**: Records, Switch expressions
- ☕ **Java 17**: Sealed classes, Pattern matching

---

## 📝 File Structure

```
java-cheatsheet/
├── README.md                  # This file
└── java-cheatsheet.java      # Complete Java cheatsheet with all examples
```

---

## 🤝 Contributing

Contributions are welcome! If you'd like to improve this cheatsheet:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/improvement`)
3. Commit your changes (`git commit -m 'Add some improvement'`)
4. Push to the branch (`git push origin feature/improvement`)
5. Open a Pull Request

### Contribution Guidelines
- Ensure code examples are correct and tested
- Follow the existing formatting and structure
- Add clear comments for complex concepts
- Update the README if adding new sections

---

## 📖 Additional Resources

- [Official Java Documentation](https://docs.oracle.com/en/java/)
- [Java Tutorials by Oracle](https://docs.oracle.com/javase/tutorial/)
- [Java API Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/)
- [Effective Java by Joshua Bloch](https://www.oreilly.com/library/view/effective-java/9780134686097/)

---

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## ⭐ Support

If you find this cheatsheet helpful, please consider giving it a star ⭐ on GitHub!

---

## 📧 Contact

Created by [@blg-kadr](https://github.com/blg-kadr)

---

**Happy Coding! 🚀**