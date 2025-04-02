package locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class taskno1 {

    @Description("Verify VWO website loads correctly")
    @Test
    public void testSelenium() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        WebElement userid= driver.findElement(By.id("txt-username"));
        userid.sendKeys("John Doe");
        WebElement pass= driver.findElement(By.id("txt-password"));
        pass.sendKeys("ThisIsNotAPassword");
        WebElement loginbutton= driver.findElement(By.id("btn-login"));
        loginbutton.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
       // Assert.assertTrue(driver.getPageSource().contains("Make Appointment"), "Page does not contain expected heading!");
        driver.quit();



    }}