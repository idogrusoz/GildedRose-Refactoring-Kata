# GildedRose Kata Solution

## Introduction
This repository contains my solution to the GildedRose kata, a coding exercise that focuses on refactoring and improving the inventory management system of a fictional inn. The purpose of this project is to demonstrate my technical skills as a Java developer and showcase my ability to refactor and enhance existing code.

## Project Structure
The project follows a standard Java project structure, adhering to best practices and conventions. New structure added to the code is as follows:

1. **model**: This package contains the classes that wrap the Item class.
2. **mapper**: This package contains the ItemMapper class to map the default Item class to the matching one from the new model.

## Dependencies
No new dependencies were added.

## Running & Testing

1. Run the following command from the project root:\
   `./mvnw exec:java -Dexec.mainClass="com.gildedrose.TexttestFixture" -Dexec.classpathScope=test`
2. The initial state and the state after a single update will be prompted.
3. If you want to see the results after `n` days run the following command:\
   `./mvnw exec:java -Dexec.mainClass="com.gildedrose.TexttestFixture" -Dexec.classpathScope=test -Dexec.args="<n>" `
4. You can edit the initial state in `src/test/java/com/gildedrose/TexttestFixture.java` file.

## Unit Testing
The GildedRose kata solution includes a suite of unit tests to ensure the correctness of the code. The tests cover various scenarios and edge cases to validate the behavior of the inventory management system.

To run the tests, follow these steps:

1. Open the project in your Java IDE.
2. Locate the test directory (`tests`) and navigate to it.
3. Run the test suite using your IDE's testing framework.
4. Alternatively you can run\
   `./mvnw test`

