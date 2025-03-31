package selenium1;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class edgeoptions {

    @Description("Verify VWO website loads correctly")
    @Test
    public void testSelenium() throws InterruptedException {

        EdgeOptions options=new EdgeOptions();
        options.addArguments("--headless");

        // Example: Disable GPU usage (useful in headless mode)
        options.addArguments("--disable-gpu");

        // Example: Start in private browsing mode
        options.addArguments("-incognito");

        // Example: Set a custom user agent
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        }}
