package tests.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    public void setup(String browser, String url) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        driver.get(url);
    }

    @Test(priority = 1, enabled = false)
    public void logoTest() {
        System.out.println("This is the logo test");
    }

    @Test(priority = 2, enabled = false)
    public void homePageTitle() {
        System.out.println("This is the home page title test");
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Title does not match");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
