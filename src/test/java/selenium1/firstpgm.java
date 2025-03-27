package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstpgm {

        @Test
        public void testselenium () {

        WebDriver driver = new ChromeDriver();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.get("https://ssdiary.com");

        driver.manage().window().maximize();
        driver.quit();
    }
    }