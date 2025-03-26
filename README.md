# Selenium Learning Guide

This repository is designed to help you learn all key concepts of Selenium step by step with examples.

---

## 🏁 Prerequisites
- Java (8 or above)
- Selenium WebDriver
- IDE (IntelliJ, Eclipse, or VS Code)
- Maven (optional for dependency management)
- Browser (Chrome, Firefox, or Edge)

---

## 🚀 Getting Started
1. Install Java and set up environment variables.
2. Set up a Maven project or add Selenium JAR files to your project.
3. Add Selenium dependencies (if using Maven):

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.x.x</version>
</dependency>
```

4. Install browser drivers (e.g., chromedriver for Chrome) and set the system property in your code:

```java
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
```

---

## 📚 Selenium Concepts and Examples

### 1. Launching a Browser
```java
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
System.out.println(driver.getTitle());
driver.quit();
```

### 2. Locators
- **ID**: `driver.findElement(By.id("elementID"));`
- **Name**: `driver.findElement(By.name("elementName"));`
- **Class Name**: `driver.findElement(By.className("className"));`
- **XPath**: `driver.findElement(By.xpath("//tagname[@attribute='value']"));`
- **CSS Selector**: `driver.findElement(By.cssSelector("cssSelector"));`

### 3. Handling Web Elements
```java
WebElement searchBox = driver.findElement(By.name("q"));
searchBox.sendKeys("Selenium Tutorial");
searchBox.submit();
```

### 4. Handling Alerts
```java
Alert alert = driver.switchTo().alert();
alert.accept();  // Accept alert
alert.dismiss(); // Dismiss alert
```

### 5. Handling Frames
```java
driver.switchTo().frame("frameName");
// Perform actions inside the frame
driver.switchTo().defaultContent();
```

### 6. Handling Windows
```java
String mainWindow = driver.getWindowHandle();
for (String windowHandle : driver.getWindowHandles()) {
    driver.switchTo().window(windowHandle);
}
driver.switchTo().window(mainWindow);
```

### 7. Waits
```java
// Implicit Wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// Explicit Wait
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementID")));
```

### 8. Actions Class (Mouse and Keyboard Events)
```java
Actions actions = new Actions(driver);
WebElement element = driver.findElement(By.id("elementID"));
actions.moveToElement(element).click().perform();
```

### 9. Taking Screenshots
```java
TakesScreenshot ts = (TakesScreenshot) driver;
File src = ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("screenshot.png"));
```

### 10. Data-Driven Testing with Excel
```java
FileInputStream fis = new FileInputStream("data.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet sheet = workbook.getSheet("Sheet1");
String data = sheet.getRow(0).getCell(0).getStringCellValue();
```

### 11. TestNG Integration
```java
@Test
public void googleSearchTest() {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com");
    Assert.assertEquals(driver.getTitle(), "Google");
    driver.quit();
}
```

### 12. Page Object Model (POM)
```java
public class LoginPage {
    WebDriver driver;
    @FindBy(id = "username") WebElement username;
    @FindBy(id = "password") WebElement password;
    @FindBy(id = "login") WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String user, String pass) {
        username.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
    }
}
```

---

## 🏆 Advanced Topics
- Handling Cookies
- Working with JavaScript Executor
- Running Tests in Parallel
- CI/CD Integration with Jenkins

---

## 📌 Resources
- [Official Selenium Documentation](https://www.selenium.dev/documentation/)
- [Selenium GitHub Repository](https://github.com/SeleniumHQ/selenium)
- [TestNG Documentation](https://testng.org/doc/)

---

## 📧 Contact
- **Author:** Athira Preman K
- **Email:** athirapremk@gmail.com

Happy Testing! 🚀

