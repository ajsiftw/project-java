package tests.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTestOne {

    WebDriver driver;

    @Test
    public void logoTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        Thread.sleep(3000);
    }

    @Test
    public void homePageTitle() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Title does not match");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
