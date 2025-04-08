package selenium1;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class seleniumminiproject3 {
    @Description("Verify VWO website loads correctly use id locator")
    @Test
    public void idlocator() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("btn-make-appointment")).click();
        //login
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();
        Thread.sleep(3000);
        //dropdown value selction from 3
        Select select=new Select(driver.findElement(By.id("combo_facility")));
        select.selectByIndex(2);
        Thread.sleep(3000);
        //check box selection
        driver.findElement(By.id("chk_hospotal_readmission")).click();Thread.sleep(3000);
        //radio button seelction
        driver.findElement(By.id("radio_program_none")).click();Thread.sleep(3000);
        //choosing one date
        driver.findElement(By.xpath("//input[@id='txt_visit_date']")).sendKeys("10/01/2025");
        driver.findElement(By.id("txt_comment")).sendKeys("ABC");
        driver.findElement(By.id("btn-book-appointment")).click();
        driver.quit();





    }}