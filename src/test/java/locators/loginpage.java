package locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginpage {

    @Description("Verify VWO website loads correctly")
    @Test
    public void testSelenium() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        Thread.sleep(8000);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement email=driver.findElement(By.id("login-username"));
        email.sendKeys("admin@admin.com");
        Thread.sleep(3000);
        WebElement pass=driver.findElement(By.id("login-password"));
        pass.sendKeys("admin");
        Thread.sleep(3000);
        WebElement button=driver.findElement(By.id("js-login-btn"));
        button.click();
        Thread.sleep(3000);
        WebElement erroromessage=driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(erroromessage.getText(),"Your email, password, IP address or location did not match");
        driver.quit();





    }}