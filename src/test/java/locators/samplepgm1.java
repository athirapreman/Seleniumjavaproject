package locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class samplepgm1 {
    @Description("namelocator")
    @Test
    public void namelocator() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        samplepgmwithlocatorid obj = new samplepgmwithlocatorid();  // Create an object of ClassA
        obj.idlocator();
        driver.get("https://katalon-demo-cura.herokuapp.com");
        WebElement button=driver.findElement(By.id("btn-make-appointment"));
        button.click();
       /* WebElement link=driver.findElement(By.linkText("info@katalon.com"));
        link.click();*/
        WebElement link=driver.findElement(By.partialLinkText("info"));
        link.click();
        driver.quit();



    }
}
