package locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class samplepgmwithlocatorid {
    @Description("Verify VWO website loads correctly use id locator")
    @Test
    public void idlocator() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        Thread.sleep(300);
        driver.manage().window().maximize();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // <input type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username" data-qa="hocewoqisi">
        WebElement username=driver.findElement(By.id("login-username"));
        username.sendKeys("admin@admin.com");
        //<input type="password"
        // class="text-input W(100%)"
        // name="password" id="login-password"
        // data-qa="jobodapuxe">
        WebElement password=driver.findElement(By.id("login-password"));
        password.sendKeys("admin");
       // <button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica">
        WebElement loginbutton=driver.findElement(By.id("js-login-btn"));
        loginbutton.click();
        driver.quit();
    }


}
