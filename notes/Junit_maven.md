# Maven & JUnit 5 (Jupiter) Notes

# Maven

## What is Maven?

Maven is a **Build Automation Tool** and **Dependency Management Tool** for Java.

It helps us:

* Download dependencies
* Compile Java code
* Run tests
* Package application (.jar/.war)
* Install project into local repository
* Deploy project

---

# Maven vs Node.js

| Node.js       | Java (Maven)           | Purpose                                          |
| ------------- | ---------------------- | ------------------------------------------------ |
| npm           | mvn                    | Package Manager + Build Tool                     |
| package.json  | pom.xml                | Project Configuration                            |
| node_modules  | ~/.m2/repository       | Dependency Cache                                 |
| npm install   | mvn install            | Download dependencies & install artifact locally |
| npm test      | mvn test               | Run tests                                        |
| npm run build | mvn package            | Build project                                    |
| npm init      | mvn archetype:generate | Create project                                   |
| dist          | target                 | Build Output                                     |
| npm publish   | mvn deploy             | Publish artifact                                 |

---

# Project Structure

```
Project
│
├── pom.xml
├── src
│
├── target
│
└── .m2 (Global Dependency Cache)
```

---

# pom.xml

The pom.xml is similar to package.json.

It contains:

* Project Information
* Dependencies
* Plugins
* Java Version
* Build Configuration

Example:

```xml
<project>

    <groupId>org.example</groupId>

    <artifactId>DataStructure</artifactId>

    <version>1.0-SNAPSHOT</version>

</project>
```

---

# Adding Dependency

Example:

```xml
<dependency>

    <groupId>org.junit.jupiter</groupId>

    <artifactId>junit-jupiter</artifactId>

    <version>5.12.2</version>

    <scope>test</scope>

</dependency>
```

After adding dependency:

```
mvn install
```

or simply reload Maven project in IntelliJ.

---

# Maven Commands

Compile project

```
mvn compile
```

Run Tests

```
mvn test
```

Package Project

```
mvn package
```

Install in Local Repository

```
mvn install
```

Delete Build Folder

```
mvn clean
```

Deploy Project

```
mvn deploy
```

---

# Maven Lifecycle

```
validate
      ↓
compile
      ↓
test
      ↓
package
      ↓
verify
      ↓
install
      ↓
deploy
```

When we execute:

```
mvn package
```

Maven automatically performs:

```
validate
↓
compile
↓
test
↓
package
```

---

# JUnit

## What is JUnit?

JUnit is a Java Testing Framework.

Current version:

```
JUnit 5
```

JUnit 5 consists of

```
JUnit Platform

↓

JUnit Jupiter

↓

JUnit Vintage
```

We generally write tests using

```
JUnit Jupiter
```

---

# Jest vs JUnit

| Jest         | JUnit                        |
| ------------ | ---------------------------- |
| describe()   | Test Class                   |
| test()       | @Test                        |
| beforeEach() | @BeforeEach                  |
| afterEach()  | @AfterEach                   |
| beforeAll()  | @BeforeAll                   |
| afterAll()   | @AfterAll                    |
| expect()     | assertEquals(), assertTrue() |

---

# Test Folder Structure

```
src
│
├── main
│   └── java
│
└── test
    └── java
```

Production code

```
src/main/java
```

Test code

```
src/test/java
```

---

# Test Structure (AAA Pattern)

Every test follows:

```
Arrange

↓

Act

↓

Assert
```

Example:

```java
@Test
void shouldAddNumbers() {

    // Arrange
    Calculator calculator = new Calculator();

    // Act
    int result = calculator.add(10,20);

    // Assert
    assertEquals(30,result);

}
```

---

# JUnit Annotations

## @Test

Marks a method as a test.

```java
@Test
void shouldAddNumbers(){

}
```

---

## @BeforeEach

Runs before every test.

```java
@BeforeEach
void setup(){

}
```

Equivalent to:

```
beforeEach()
```

in Jest.

---

## @AfterEach

Runs after every test.

```java
@AfterEach
void cleanup(){

}
```

---

## @BeforeAll

Runs once before all tests.

```java
@BeforeAll
static void init(){

}
```

---

## @AfterAll

Runs once after all tests.

```java
@AfterAll
static void destroy(){

}
```

---

## @DisplayName

Custom test name.

```java
@DisplayName("Insert Node At Head")
```

---

## @Disabled

Skip test.

```java
@Disabled
```

Equivalent:

```
test.skip()
```

---

## @Nested

Group related tests.

---

## @ParameterizedTest

Execute same test with multiple inputs.

---

# Assertions

## assertEquals

Checks expected value equals actual value.

```java
assertEquals(expected, actual);
```

Example:

```java
assertEquals(5, calculator.add(2,3));
```

Equivalent:

```
expect().toBe()
```

---

## assertNotEquals

```java
assertNotEquals(expected, actual);
```

---

## assertTrue

```java
assertTrue(condition);
```

Example:

```java
assertTrue(list.isEmpty());
```

---

## assertFalse

```java
assertFalse(condition);
```

---

## assertNull

```java
assertNull(object);
```

---

## assertNotNull

```java
assertNotNull(object);
```

---

## assertSame

Checks both references point to the same object.

```java
assertSame(a,b);
```

---

## assertNotSame

```java
assertNotSame(a,b);
```

---

## assertArrayEquals

```java
assertArrayEquals(expected, actual);
```

---

## assertIterableEquals

Useful for List.

```java
assertIterableEquals(expectedList, actualList);
```

---

## assertThrows

Verify exception.

```java
assertThrows(
        RuntimeException.class,
        () -> stack.pop()
);
```

Equivalent:

```
expect(fn).toThrow()
```

---

## assertDoesNotThrow

```java
assertDoesNotThrow(() -> {

        });
```

---

## fail

Force test failure.

```java
fail("Should never reach here");
```

---

# Writing Good Test Cases

One Test = One Behaviour

✅ Good

```
shouldInsertAtHead()

shouldInsertAtTail()

shouldRemoveHead()

shouldRemoveTail()

shouldReturnTrueWhenEmpty()

shouldThrowExceptionWhenPopOnEmptyStack()
```

❌ Bad

```
test1()

test2()

testMethod()
```

---

# What Should Be Tested?

For every method think about

### Happy Path

Does it work correctly?

Example

```
insert()

push()

pop()
```

---

### Boundary Cases

```
Empty List

Single Element

Multiple Elements
```

---

### Invalid Input

```
null

Invalid Index

Missing Node
```

---

### Exception Cases

```
Pop Empty Stack

Remove Empty List
```

---

### State Changes

```
Size increases

Size decreases

Head changes

Tail changes
```

---

# Test Flow

```
Write Test

↓

Run Test

↓

Fail

↓

Fix Code

↓

Run Again

↓

Pass

↓

Refactor
```

This approach is called **Test-Driven Development (TDD)**.

---

# Quick Revision

## Maven

* Build Tool
* Dependency Manager
* Uses pom.xml
* Downloads libraries
* Compiles code
* Runs tests
* Creates JAR/WAR

---

## JUnit

* Java Testing Framework
* Uses JUnit Jupiter
* Test files inside src/test/java

---

## Most Used Annotations

* @Test
* @BeforeEach
* @AfterEach
* @BeforeAll
* @AfterAll
* @ParameterizedTest

---

## Most Used Assertions

* assertEquals()
* assertTrue()
* assertFalse()
* assertNull()
* assertNotNull()
* assertThrows()
* assertDoesNotThrow()

---

# Interview Tip

When asked **"How do you write a unit test?"**

Answer:

1. Arrange (Prepare data)
2. Act (Call the method)
3. Assert (Verify the result)

This is known as the **AAA (Arrange-Act-Assert)** pattern and is the standard structure for writing clean, maintainable unit tests.
