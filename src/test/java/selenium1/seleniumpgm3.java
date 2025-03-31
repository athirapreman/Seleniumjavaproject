package selenium1;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumpgm3 {
    @Description
    @Test
    public  void  testselenium(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://vwo.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.quit();



    }
}
