// ============================================================================
// JAVA CHEATSHEET - Comprehensive Reference Guide
// ============================================================================

// ----------------------------------------------------------------------------
// 1. BASIC SYNTAX & STRUCTURE
// ----------------------------------------------------------------------------

// Basic class structure
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// Comments
// Single-line comment
/* Multi-line comment */
/** JavaDoc comment */

// Package declaration (must be first line)
package com.example.project;

// Import statements
import java.util.ArrayList;
import java.util.*; // Import all classes from package

// ----------------------------------------------------------------------------
// 2. DATA TYPES
// ----------------------------------------------------------------------------

// Primitive Types (8 total)
byte myByte = 127;              // 8-bit, -128 to 127
short myShort = 32767;          // 16-bit, -32,768 to 32,767
int myInt = 2147483647;         // 32-bit, -2^31 to 2^31-1
long myLong = 9223372036854775807L; // 64-bit, add 'L' suffix
float myFloat = 3.14f;          // 32-bit, add 'f' suffix
double myDouble = 3.14159;      // 64-bit (default for decimals)
char myChar = 'A';              // 16-bit Unicode character
boolean myBoolean = true;       // true or false

// Reference Types
String myString = "Hello";      // String is immutable
Integer myInteger = 42;         // Wrapper class for int
int[] myArray = {1, 2, 3};      // Array

// Type Casting
int i = 10;
double d = i;                   // Automatic (widening)
double d2 = 10.5;
int i2 = (int) d2;             // Manual (narrowing)

// ----------------------------------------------------------------------------
// 3. VARIABLES & CONSTANTS
// ----------------------------------------------------------------------------

// Variable declaration
int age;
age = 25;
int height = 180;              // Declaration + initialization

// Constants
final double PI = 3.14159;     // Cannot be changed
static final String APP_NAME = "MyApp"; // Class constant

// Variable scope
public class Scope {
    static int classVar = 1;   // Class variable
    int instanceVar = 2;       // Instance variable
    
    void method() {
        int localVar = 3;      // Local variable
    }
}

// ----------------------------------------------------------------------------
// 4. OPERATORS
// ----------------------------------------------------------------------------

// Arithmetic Operators
int a = 10, b = 3;
int sum = a + b;               // Addition: 13
int diff = a - b;              // Subtraction: 7
int product = a * b;           // Multiplication: 30
int quotient = a / b;          // Division: 3 (integer division)
int remainder = a % b;         // Modulus: 1
a++;                           // Increment: a = 11
b--;                           // Decrement: b = 2

// Assignment Operators
int x = 5;
x += 3;                        // x = x + 3; (8)
x -= 2;                        // x = x - 2; (6)
x *= 2;                        // x = x * 2; (12)
x /= 4;                        // x = x / 4; (3)
x %= 2;                        // x = x % 2; (1)

// Comparison Operators (return boolean)
boolean eq = (5 == 5);         // Equal to: true
boolean neq = (5 != 3);        // Not equal to: true
boolean gt = (5 > 3);          // Greater than: true
boolean lt = (5 < 3);          // Less than: false
boolean gte = (5 >= 5);        // Greater than or equal: true
boolean lte = (3 <= 5);        // Less than or equal: true

// Logical Operators
boolean and = (true && false); // AND: false
boolean or = (true || false);  // OR: true
boolean not = !true;           // NOT: false

// Ternary Operator
int max = (a > b) ? a : b;     // If a > b, max = a, else max = b

// Bitwise Operators
int bitwiseAnd = 5 & 3;        // AND: 1
int bitwiseOr = 5 | 3;         // OR: 7
int bitwiseXor = 5 ^ 3;        // XOR: 6
int bitwiseNot = ~5;           // NOT: -6
int leftShift = 5 << 1;        // Left shift: 10
int rightShift = 5 >> 1;       // Right shift: 2

// ----------------------------------------------------------------------------
// 5. CONTROL FLOW STATEMENTS
// ----------------------------------------------------------------------------

// If-Else Statement
int score = 85;
if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 70) {
    System.out.println("C");
} else {
    System.out.println("F");
}

// Switch Statement
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Other day");
        break;
}

// Switch Expression (Java 12+)
String dayName = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    default -> "Other day";
};

// ----------------------------------------------------------------------------
// 6. LOOPS
// ----------------------------------------------------------------------------

// For Loop
for (int i = 0; i < 5; i++) {
    System.out.println(i);     // Prints 0 to 4
}

// Enhanced For Loop (For-Each)
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}

// While Loop
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

// Do-While Loop (executes at least once)
int j = 0;
do {
    System.out.println(j);
    j++;
} while (j < 5);

// Break and Continue
for (int k = 0; k < 10; k++) {
    if (k == 3) continue;      // Skip iteration when k = 3
    if (k == 7) break;         // Exit loop when k = 7
    System.out.println(k);
}

// ----------------------------------------------------------------------------
// 7. ARRAYS
// ----------------------------------------------------------------------------

// Array Declaration & Initialization
int[] arr1 = new int[5];       // Creates array of size 5
int[] arr2 = {1, 2, 3, 4, 5}; // Initialize with values
String[] names = new String[] {"Alice", "Bob", "Charlie"};

// Accessing Elements
int first = arr2[0];           // First element: 1
arr2[2] = 10;                  // Modify element

// Array Length
int length = arr2.length;      // 5

// Multi-dimensional Arrays
int[][] matrix = new int[3][4]; // 3 rows, 4 columns
int[][] matrix2 = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
int element = matrix2[1][2];   // Access element: 6

// Iterating Arrays
for (int n : arr2) {
    System.out.println(n);
}

// Array Utilities
import java.util.Arrays;
Arrays.sort(arr2);             // Sort array
String str = Arrays.toString(arr2); // Convert to string
int[] copy = Arrays.copyOf(arr2, arr2.length); // Copy array
boolean equal = Arrays.equals(arr1, arr2); // Compare arrays

// ----------------------------------------------------------------------------
// 8. STRINGS
// ----------------------------------------------------------------------------

// String Creation
String s1 = "Hello";           // String literal
String s2 = new String("Hello"); // Using constructor
String s3 = String.valueOf(123); // Convert int to String

// String Methods
int len = s1.length();         // Length: 5
char ch = s1.charAt(0);        // Get character: 'H'
String sub = s1.substring(1, 4); // Substring: "ell"
String upper = s1.toUpperCase(); // "HELLO"
String lower = s1.toLowerCase(); // "hello"
boolean contains = s1.contains("ell"); // true
boolean startsWith = s1.startsWith("He"); // true
boolean endsWith = s1.endsWith("lo"); // true
String replaced = s1.replace("l", "L"); // "HeLLo"
String trimmed = "  hello  ".trim(); // "hello"
String[] parts = "a,b,c".split(","); // ["a", "b", "c"]

// String Comparison
boolean equals = s1.equals(s2); // Compare content
boolean equalsIgnore = s1.equalsIgnoreCase("hello"); // true
int compare = s1.compareTo(s2); // Lexicographical comparison

// String Concatenation
String full = "Hello" + " " + "World"; // Using +
String concat = s1.concat(" World");   // Using concat()

// StringBuilder (mutable, thread-safe: use StringBuffer)
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" World");
sb.insert(5, ",");             // "Hello, World"
sb.delete(5, 6);               // "Hello World"
sb.reverse();                  // "dlroW olleH"
String result = sb.toString();

// String Formatting
String formatted = String.format("Name: %s, Age: %d", "Alice", 25);
System.out.printf("Value: %.2f%n", 3.14159); // Print formatted

// ----------------------------------------------------------------------------
// 9. METHODS (FUNCTIONS)
// ----------------------------------------------------------------------------

// Method Declaration
public static int add(int a, int b) {
    return a + b;
}

// Method Overloading (same name, different parameters)
public static double add(double a, double b) {
    return a + b;
}

public static int add(int a, int b, int c) {
    return a + b + c;
}

// Void Method (no return value)
public static void printMessage(String msg) {
    System.out.println(msg);
}

// Varargs (variable number of arguments)
public static int sum(int... numbers) {
    int total = 0;
    for (int num : numbers) {
        total += num;
    }
    return total;
}
// Usage: sum(1, 2, 3, 4, 5)

// Method with Default Access Modifier
void defaultMethod() {
    // Package-private
}

// ----------------------------------------------------------------------------
// 10. OBJECT-ORIENTED PROGRAMMING (OOP)
// ----------------------------------------------------------------------------

// Class Definition
public class Person {
    // Fields (attributes)
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Default Constructor
    public Person() {
        this("Unknown", 0);
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Method
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
    
    // toString Method
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// Object Creation
Person person1 = new Person("Alice", 25);
person1.introduce();

// ----------------------------------------------------------------------------
// 11. INHERITANCE
// ----------------------------------------------------------------------------

// Parent Class
public class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
}

// Child Class
public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, String breed) {
        super(name);           // Call parent constructor
        this.breed = breed;
    }
    
    @Override
    public void eat() {
        System.out.println(name + " the dog is eating");
    }
    
    public void bark() {
        System.out.println("Woof!");
    }
}

// Usage
Dog dog = new Dog("Buddy", "Golden Retriever");
dog.eat();                     // Overridden method
dog.bark();                    // Dog-specific method

// ----------------------------------------------------------------------------
// 12. POLYMORPHISM
// ----------------------------------------------------------------------------

// Method Overriding (runtime polymorphism)
Animal animal = new Dog("Max", "Labrador");
animal.eat();                  // Calls Dog's eat() method

// Method Overloading (compile-time polymorphism)
// See section 9

// ----------------------------------------------------------------------------
// 13. ABSTRACTION
// ----------------------------------------------------------------------------

// Abstract Class
public abstract class Shape {
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    // Abstract method (no implementation)
    public abstract double area();
    
    // Concrete method
    public void display() {
        System.out.println("Color: " + color);
    }
}

// Concrete Class
public class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// ----------------------------------------------------------------------------
// 14. INTERFACES
// ----------------------------------------------------------------------------

// Interface Definition
public interface Drawable {
    // Abstract method (implicitly public abstract)
    void draw();
    
    // Default method (Java 8+)
    default void print() {
        System.out.println("Printing...");
    }
    
    // Static method (Java 8+)
    static void info() {
        System.out.println("Drawable interface");
    }
    
    // Constants (implicitly public static final)
    int MAX_SIZE = 100;
}

// Implementing Interface
public class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

// Multiple Interface Implementation
public class Square implements Drawable, Comparable<Square> {
    private int side;
    
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
    
    @Override
    public int compareTo(Square other) {
        return Integer.compare(this.side, other.side);
    }
}

// ----------------------------------------------------------------------------
// 15. ENCAPSULATION
// ----------------------------------------------------------------------------

// Access Modifiers
public class EncapsulationExample {
    public int publicVar;       // Accessible everywhere
    protected int protectedVar; // Accessible in same package & subclasses
    int defaultVar;             // Package-private (no modifier)
    private int privateVar;     // Accessible only within class
    
    // Getter/Setter for private field
    public int getPrivateVar() {
        return privateVar;
    }
    
    public void setPrivateVar(int value) {
        if (value >= 0) {
            this.privateVar = value;
        }
    }
}

// ----------------------------------------------------------------------------
// 16. STATIC KEYWORD
// ----------------------------------------------------------------------------

public class Counter {
    private static int count = 0; // Shared by all instances
    private int id;
    
    public Counter() {
        count++;
        this.id = count;
    }
    
    public static int getCount() {
        return count;              // Static method
    }
    
    // Static block (runs once when class is loaded)
    static {
        System.out.println("Static block executed");
    }
}

// Usage
Counter c1 = new Counter();
Counter c2 = new Counter();
System.out.println(Counter.getCount()); // 2

// ----------------------------------------------------------------------------
// 17. EXCEPTION HANDLING
// ----------------------------------------------------------------------------

// Try-Catch Block
try {
    int result = 10 / 0;       // ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
    e.printStackTrace();
} catch (Exception e) {
    System.out.println("Generic exception");
} finally {
    System.out.println("Always executes");
}

// Try-with-Resources (Java 7+)
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    String line = br.readLine();
} catch (IOException e) {
    e.printStackTrace();
}

// Throwing Exceptions
public void validateAge(int age) throws IllegalArgumentException {
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative");
    }
}

// Custom Exception
public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Common Exceptions
// - NullPointerException
// - ArrayIndexOutOfBoundsException
// - ArithmeticException
// - NumberFormatException
// - IOException
// - FileNotFoundException
// - ClassNotFoundException

// ----------------------------------------------------------------------------
// 18. COLLECTIONS FRAMEWORK
// ----------------------------------------------------------------------------

import java.util.*;

// List (ordered, allows duplicates)
List<String> arrayList = new ArrayList<>();
arrayList.add("Apple");
arrayList.add("Banana");
arrayList.add(1, "Cherry");    // Insert at index
arrayList.remove("Banana");
String first = arrayList.get(0);
int size = arrayList.size();

List<String> linkedList = new LinkedList<>(); // Better for insertions/deletions

// Set (unordered, no duplicates)
Set<Integer> hashSet = new HashSet<>();
hashSet.add(1);
hashSet.add(2);
hashSet.add(1);                // Ignored (duplicate)
boolean contains = hashSet.contains(1);

Set<Integer> treeSet = new TreeSet<>(); // Sorted set
Set<Integer> linkedHashSet = new LinkedHashSet<>(); // Maintains insertion order

// Map (key-value pairs)
Map<String, Integer> hashMap = new HashMap<>();
hashMap.put("Alice", 25);
hashMap.put("Bob", 30);
int age = hashMap.get("Alice");
hashMap.remove("Bob");
boolean hasKey = hashMap.containsKey("Alice");
boolean hasValue = hashMap.containsValue(25);

// Iterating Map
for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}

Map<String, Integer> treeMap = new TreeMap<>(); // Sorted by keys
Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // Insertion order

// Queue (FIFO)
Queue<String> queue = new LinkedList<>();
queue.offer("First");          // Add element
queue.offer("Second");
String head = queue.poll();    // Remove and return head
String peek = queue.peek();    // View head without removing

// Stack (LIFO)
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
int top = stack.pop();         // Remove and return top
int peekTop = stack.peek();    // View top without removing

// Collections Utility Methods
Collections.sort(arrayList);   // Sort list
Collections.reverse(arrayList); // Reverse list
Collections.shuffle(arrayList); // Shuffle list
int max = Collections.max(arrayList);
int min = Collections.min(arrayList);

// ----------------------------------------------------------------------------
// 19. GENERICS
// ----------------------------------------------------------------------------

// Generic Class
public class Box<T> {
    private T content;
    
    public void set(T content) {
        this.content = content;
    }
    
    public T get() {
        return content;
    }
}

// Usage
Box<Integer> intBox = new Box<>();
intBox.set(42);
int value = intBox.get();

Box<String> strBox = new Box<>();
strBox.set("Hello");

// Generic Method
public static <T> void printArray(T[] array) {
    for (T element : array) {
        System.out.println(element);
    }
}

// Bounded Type Parameters
public class NumberBox<T extends Number> {
    private T number;
    
    public double getDoubleValue() {
        return number.doubleValue();
    }
}

// Wildcards
public void processList(List<?> list) {
    // ? means any type
}

public void processNumbers(List<? extends Number> list) {
    // Upper bounded wildcard
}

public void addNumbers(List<? super Integer> list) {
    // Lower bounded wildcard
}

// ----------------------------------------------------------------------------
// 20. LAMBDA EXPRESSIONS (Java 8+)
// ----------------------------------------------------------------------------

// Functional Interface
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

// Lambda Expression
MathOperation addition = (a, b) -> a + b;
MathOperation multiplication = (a, b) -> a * b;
int result = addition.operate(5, 3); // 8

// Lambda with Collections
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.forEach(name -> System.out.println(name));
names.sort((s1, s2) -> s1.compareTo(s2));

// Method Reference
names.forEach(System.out::println);
names.sort(String::compareTo);

// ----------------------------------------------------------------------------
// 21. STREAMS API (Java 8+)
// ----------------------------------------------------------------------------

import java.util.stream.*;

List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Filter and Collect
List<Integer> evens = nums.stream()
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());

// Map (transform)
List<Integer> squared = nums.stream()
    .map(n -> n * n)
    .collect(Collectors.toList());

// Reduce
int sum = nums.stream()
    .reduce(0, (a, b) -> a + b);

// Common Stream Operations
long count = nums.stream().count();
Optional<Integer> max = nums.stream().max(Integer::compareTo);
Optional<Integer> min = nums.stream().min(Integer::compareTo);
boolean anyMatch = nums.stream().anyMatch(n -> n > 5);
boolean allMatch = nums.stream().allMatch(n -> n > 0);
boolean noneMatch = nums.stream().noneMatch(n -> n < 0);

// Sorted
List<Integer> sorted = nums.stream()
    .sorted()
    .collect(Collectors.toList());

// Distinct
List<Integer> unique = nums.stream()
    .distinct()
    .collect(Collectors.toList());

// Limit and Skip
List<Integer> limited = nums.stream()
    .limit(5)
    .collect(Collectors.toList());

List<Integer> skipped = nums.stream()
    .skip(5)
    .collect(Collectors.toList());

// Parallel Streams
int parallelSum = nums.parallelStream()
    .reduce(0, Integer::sum);

// ----------------------------------------------------------------------------
// 22. FILE I/O
// ----------------------------------------------------------------------------

import java.io.*;
import java.nio.file.*;

// Reading File (Old Way)
BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
String line;
while ((line = reader.readLine()) != null) {
    System.out.println(line);
}
reader.close();

// Writing File (Old Way)
BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
writer.write("Hello, World!");
writer.newLine();
writer.close();

// Reading File (NIO - Java 7+)
List<String> lines = Files.readAllLines(Paths.get("input.txt"));
String content = Files.readString(Paths.get("input.txt")); // Java 11+

// Writing File (NIO)
Files.write(Paths.get("output.txt"), "Hello, World!".getBytes());
Files.write(Paths.get("output.txt"), lines);

// File Operations
Path path = Paths.get("file.txt");
b boolean exists = Files.exists(path);
b boolean isDirectory = Files.isDirectory(path);
long size = Files.size(path);
Files.delete(path);
Files.copy(path, Paths.get("copy.txt"));
Files.move(path, Paths.get("moved.txt"));

// ----------------------------------------------------------------------------
// 23. DATE AND TIME (Java 8+)
// ----------------------------------------------------------------------------

import java.time.*;
import java.time.format.*;

// Current Date and Time
LocalDate today = LocalDate.now();
LocalTime now = LocalTime.now();
LocalDateTime dateTime = LocalDateTime.now();
ZonedDateTime zonedDateTime = ZonedDateTime.now();

// Creating Specific Date/Time
LocalDate date = LocalDate.of(2025, 11, 12);
LocalTime time = LocalTime.of(14, 30, 0);
LocalDateTime dt = LocalDateTime.of(2025, 11, 12, 14, 30);

// Parsing
LocalDate parsedDate = LocalDate.parse("2025-11-12");
LocalTime parsedTime = LocalTime.parse("14:30:00");

// Formatting
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String formattedDate = today.format(formatter);

// Date Arithmetic
LocalDate tomorrow = today.plusDays(1);
LocalDate nextWeek = today.plusWeeks(1);
LocalDate nextMonth = today.plusMonths(1);
LocalDate lastYear = today.minusYears(1);

// Period (date-based)
Period period = Period.between(date, today);
int years = period.getYears();
int months = period.getMonths();
int days = period.getDays();

// Duration (time-based)
Duration duration = Duration.between(time, now);
long seconds = duration.getSeconds();

// ----------------------------------------------------------------------------
// 24. MULTITHREADING
// ----------------------------------------------------------------------------

// Extending Thread Class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

// Usage
MyThread thread1 = new MyThread();
thread1.start();

// Implementing Runnable Interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable running: " + Thread.currentThread().getName());
    }
}

// Usage
Thread thread2 = new Thread(new MyRunnable());
thread2.start();

// Lambda with Runnable
Thread thread3 = new Thread(() -> {
    System.out.println("Lambda thread running");
});
thread3.start();

// Thread Methods
Thread.sleep(1000);            // Sleep for 1 second
thread1.join();                // Wait for thread to finish
thread1.setName("Worker-1");
String name = thread1.getName();
boolean isAlive = thread1.isAlive();

// Synchronized Method
public synchronized void synchronizedMethod() {
    // Only one thread can execute at a time
}

// Synchronized Block
public void method() {
    synchronized(this) {
        // Critical section
    }
}

// ----------------------------------------------------------------------------
// 25. ANNOTATIONS
// ----------------------------------------------------------------------------

// Common Annotations
@Override                      // Method overrides parent method
@Deprecated                    // Marks deprecated element
@SuppressWarnings("unchecked") // Suppress compiler warnings
@FunctionalInterface           // Marks functional interface

// Custom Annotation
@interface MyAnnotation {
    String value();
    int count() default 0;
}

// Usage
@MyAnnotation(value = "test", count = 5)
public void annotatedMethod() {
}

// ----------------------------------------------------------------------------
// 26. ENUMS
// ----------------------------------------------------------------------------

// Basic Enum
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Usage
Day today = Day.MONDAY;
System.out.println(today);     // MONDAY
System.out.println(today.ordinal()); // 0

// Enum with Fields and Methods
public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    EARTH(5.976e+24, 6.37814e6);
    
    private final double mass;
    private final double radius;
    
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    
    public double getMass() {
        return mass;
    }
}

// Enum in Switch
Day day = Day.MONDAY;
switch (day) {
    case MONDAY:
        System.out.println("Start of week");
        break;
    case FRIDAY:
        System.out.println("End of week");
        break;
    default:
        System.out.println("Midweek");
}

// ----------------------------------------------------------------------------
// 27. RECORDS (Java 14+)
// ----------------------------------------------------------------------------

// Record (immutable data carrier)
public record Point(int x, int y) {
    // Automatically generates:
    // - Constructor
    // - Getters (x(), y())
    // - equals(), hashCode(), toString()
}

// Usage
Point p = new Point(10, 20);
int x = p.x();
System.out.println(p);         // Point[x=10, y=20]

// Record with Custom Constructor
public record Person(String name, int age) {
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}

// ----------------------------------------------------------------------------
// 28. OPTIONAL (Java 8+)
// ----------------------------------------------------------------------------

// Creating Optional
Optional<String> optional = Optional.of("Hello");
Optional<String> empty = Optional.empty();
Optional<String> nullable = Optional.ofNullable(null);

// Checking Value
if (optional.isPresent()) {
    System.out.println(optional.get());
}

// Better Way (avoiding get())
optional.ifPresent(value -> System.out.println(value));

// Default Values
String value = empty.orElse("Default");
String value2 = empty.orElseGet(() -> "Computed Default");
String value3 = empty.orElseThrow(() -> new RuntimeException("No value"));

// Transforming
Optional<Integer> length = optional.map(String::length);
Optional<String> upper = optional.flatMap(s -> Optional.of(s.toUpperCase()));

// Filtering
Optional<String> filtered = optional.filter(s -> s.length() > 3);

// ----------------------------------------------------------------------------
// 29. COMMON UTILITY CLASSES
// ----------------------------------------------------------------------------

// Math Class
double abs = Math.abs(-5.5);   // Absolute value: 5.5
double ceil = Math.ceil(4.3);  // Round up: 5.0
double floor = Math.floor(4.7);// Round down: 4.0
double round = Math.round(4.5);// Round: 5.0
double pow = Math.pow(2, 3);   // Power: 8.0
double sqrt = Math.sqrt(16);   // Square root: 4.0
double random = Math.random(); // Random [0.0, 1.0)
int max = Math.max(10, 20);    // Maximum: 20
int min = Math.min(10, 20);    // Minimum: 10

// Random Class
Random rand = new Random();
int randomInt = rand.nextInt(100); // Random int 0-99
double randomDouble = rand.nextDouble();
boolean randomBool = rand.nextBoolean();

// Scanner Class (User Input)
Scanner scanner = new Scanner(System.in);
System.out.print("Enter name: ");
String name = scanner.nextLine();
System.out.print("Enter age: ");
int age = scanner.nextInt();
scanner.close();

// ----------------------------------------------------------------------------
// 30. BEST PRACTICES & TIPS
// ----------------------------------------------------------------------------

/*
1. Naming Conventions:
   - Classes: PascalCase (MyClass)
   - Methods/Variables: camelCase (myMethod, myVariable)
   - Constants: UPPER_SNAKE_CASE (MAX_VALUE)
   - Packages: lowercase (com.example.project)

2. Code Organization:
   - One public class per file
   - File name matches class name
   - Package structure reflects directory structure

3. Memory Management:
   - Use try-with-resources for auto-closing
   - Avoid memory leaks (close connections, streams)
   - Use weak references when appropriate

4. Performance:
   - Use StringBuilder for string concatenation in loops
   - Use enhanced for-loop when index not needed
   - Choose appropriate collection types
   - Use primitive types when possible (avoid boxing)

5. Error Handling:
   - Use specific exceptions
   - Don't catch Exception unless necessary
   - Always close resources in finally or use try-with-resources
   - Provide meaningful error messages

6. OOP Principles:
   - Encapsulation: Use private fields with getters/setters
   - Inheritance: Use when "is-a" relationship exists
   - Polymorphism: Program to interfaces, not implementations
   - Abstraction: Hide implementation details

7. Code Quality:
   - Follow DRY (Don't Repeat Yourself)
   - Keep methods short and focused
   - Use meaningful names
   - Write comments for complex logic
   - Use JavaDoc for public APIs

8. Testing:
   - Write unit tests
   - Use JUnit or TestNG
   - Test edge cases and error conditions
   - Aim for high code coverage

9. Version Features:
   - Java 8: Lambdas, Streams, Optional, Date/Time API
   - Java 9: Modules, JShell
   - Java 10: var keyword
   - Java 11: String methods, Files methods
   - Java 14: Records, Switch expressions
   - Java 17: Sealed classes, Pattern matching
*/

// ============================================================================
// END OF JAVA CHEATSHEET
// ============================================================================
