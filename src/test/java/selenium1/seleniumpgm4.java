package selenium1;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumpgm4 {
    @Description
    @Test
    public  void  testselenium() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://vwo.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit();



    }
}
