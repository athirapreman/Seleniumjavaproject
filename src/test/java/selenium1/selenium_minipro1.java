package selenium1;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium_minipro1 {

    @Description("Verify VWO website loads correctly")
    @Test
    public void testSelenium() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
            driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        if (driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("CURA Healthcare Service is exist");
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        driver.quit();

    }}