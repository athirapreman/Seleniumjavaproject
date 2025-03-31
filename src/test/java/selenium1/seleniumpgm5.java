package selenium1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class seleniumpgm5 {

    @Description("Verify VWO website loads correctly")
    @Test
    public void testSelenium() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://vwo.com");

        // Validate URL
        Assert.assertEquals(driver.getCurrentUrl(),"https://vwo.com/");

        // Validate title
        assertThat(driver.getCurrentUrl()).isNotBlank()
                .isNotNull()
                .isEqualTo("https://vwo.com/");

        driver.quit();
    }
}
