package selenium1;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class selenumproject4 {

    @Description("Verify different JavaScript alerts on demo site")
    @Test
    public void idlocator() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        // Simple Alert
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, "You successfully clicked an alert");

        // Confirmation Alert (OK)
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        String result1 = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result1, "You clicked: Ok");

        // Prompt Alert (Enter Text)
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("ATHIRA");
        alert2.accept();
        String result2 = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result2, "You entered: ATHIRA");

        driver.quit();
    }
}
