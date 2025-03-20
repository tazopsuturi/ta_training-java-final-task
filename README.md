# SwagLabs Test Automation

This is a Selenium WebDriver-based test automation project for testing the login functionality of [SwagLabs](https://www.saucedemo.com/).

## Test Cases

### UC-1: Test Login Form with Empty Credentials
1. Type any credentials into the "Username" and "Password" fields.
2. Clear the inputs.
3. Click the "Login" button.
4. Verify the error message: **"Username is required"**.

### UC-2: Test Login Form with Credentials (Missing Password)
1. Enter any credentials in the "Username" field.
2. Enter a password.
3. Clear the "Password" input.
4. Click the "Login" button.
5. Verify the error message: **"Password is required"**.

### UC-3: Test Login Form with Valid Credentials
1. Enter a valid username from the **Accepted usernames** section.
2. Enter **"secret_sauce"** as the password.
3. Click the "Login" button.
4. Verify that the title **"Swag Labs"** appears on the dashboard.

## Project Setup

### Tools & Technologies:
- **Test Automation Tool**: Selenium WebDriver
- **Project Builder**: Maven
- **Browsers**: Firefox, Edge
- **Locators**: XPath
- **Test Runner**: JUnit
- **Assertions**: Hamcrest
- **[Optional] Design Patterns**: Singleton, Adapter, Strategy
- **[Optional] Test Approach**: BDD
- **Logging**: SLF4J

## Running Tests

### Execute Tests:

**execute user access test**
```sh
mvn clean test -Dbrowser=chrome -Denvironment=testdata -Dtest=UserAccessTest
```

**execute AccessWithoutUserName Test**
```sh
mvn clean test -Dbrowser=chrome -Denvironment=testdata -Dtest=AccessWithoutUserNameTest
```

**execute AccessWithoutPassword Test**
```sh
mvn clean test -Dbrowser=chrome -Denvironment=testdata -Dtest=AccessWithoutPasswordTest
```

### Project Structure


```bash

├── src
│   ├── test
│   │   ├── java
│   │   │   ├── com.epam.training.student_tamaz_psuturi
│   │   │   │   ├── driver/
│   │   │   │   ├── feature/
│   │   │   │   ├── page/
│   │   │   │   ├── model/
│   │   │   │   ├── service/
│   │   │   │   ├── stepdefinitions/
│   │   │   │   ├── tests/
│   │   │   │   ├── utils/
│   │   ├── resources
│   │   │   ├── environment/
 
```

### Notes
- Tests are parameterized using DataProvider.  
- Singleton pattern is used for WebDriver instance management.  
- Adapter and Strategy patterns have been implemented for scalability and maintenance.  
- BDD (Behavior-Driven Development) approach is considered, but not fully implemented.  