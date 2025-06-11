
# Software Testing Assignment

### Project Overview

This framework automates testing for the Page Load Performance of Web Elements, Login functionality with incorrect credentials, forgot password and instagram redirection if forgot password link is not available of a web application using:
- Selenium WebDriver
- TestNG
- ExtentReports for HTML reporting
- Screenshots for failed tests
- Page Object Model (POM) design pattern

---

## Below Technologies are used:

| Tool/Library      | Purpose                         |
|-------------------|---------------------------------|
| Java              | Programming Language            |
| Selenium WebDriver | UI Automation                   |
| TestNG            | Test Framework                  |
| ExtentReports     | HTML Reporting                  |
| Maven             | Build Tool and Dependency Management|
---

## Dependencies & Setup

### Prerequisites
- Java JDK 17 or above
- Maven 3.6+
- Chrome Browser
- IDE (IntelliJ)
- Git (for version control)

---

## Maven Dependencies
To ensure below denpencies are installed in the 
```
  <dependencies>

    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>4.27.0</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>5.7.0</version>
    </dependency>


    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.testng/testng -->
    <dependency>
      <groupId>org.testng</groupId>
      <artifactId>testng</artifactId>
      <version>7.10.2</version>
      <scope>test</scope>
    </dependency>

    <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
    <dependency>
      <groupId>com.aventstack</groupId>
      <artifactId>extentreports</artifactId>
      <version>5.0.9</version>
    </dependency>
  
  </dependencies>
  ```
---
## Instructions to Run Tests

Clone the repository:
git clone https://github.com/Rajashrilbp/software-testing-assignment
---
## Framework Structure

```
src
└── main
    ├── java
    │   └── org.merchant
    │       ├── driver            # WebDriver setup and management
    │       ├── pages             # Page classes (LoginPage, etc.)
    │       ├── reports           # Extent Report (HTML Reports)
    │       └── utils             # Utility classes (ScreenshotUtils)
    └── resources
          
src
└── test                   
    ├── java
    │   └── org.merchant
    │                └── testscript        # Test classes (LoginPageTest.java)
    └── resources               
        └── extent-reports        # HTML Reports
        └── screenshots           # Screenshot images    
```

---
## Test Cases

| Test Case               | Description                                                              |
|-------------------------|--------------------------------------------------------------------------|
| `verifyLoginElements`   | Verifying page load performance for login elements                       |
| `verifyLogin`           | Validates login error message with invalid credentials                   |
| `verifyForgotPassword`  | Validates forgot password flow if forgot password link is visible        |
| `verifyInstagramAccount`| Validates instagram site is redirected if forgot password is not visible |

---

## Screenshot and Reporting

- Screenshots are saved in:  
  `src/test/resources/screenshots/`

- HTML Report (ExtentReports) is generated at:  
  `src/test/resources/extent-reports/`

---
## Contact

For queries ,please reach out to:
- Rajashri Yalla 
- Email: yallarajshri05@gmail.com

---
