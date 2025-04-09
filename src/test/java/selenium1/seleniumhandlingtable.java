package selenium1;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class seleniumhandlingtable {

    @Description("Read data from a web table")
    @Test
    public void readWebTable() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/webtable.html");

        String first_part = "//table[@id='customers']/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        for (int i = 2; i <= row; i++) {  // start from 2 to skip table header
            for (int j = 1; j <= column; j++) {
                String dynamicXPath = first_part + i + second_part + j + third_part;
                String data = driver.findElement(By.xpath(dynamicXPath)).getText();
                System.out.print(data + " | ");
            }
            System.out.println();  // new line after each row
        }

        driver.quit();
    }
}
