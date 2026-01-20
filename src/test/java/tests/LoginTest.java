package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Log;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void testValidLogin() {
        Log.info("Starting login test...");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("admin@yourstore.com");
        loginPage.enterPassword("admin");
        loginPage.clickLogin();
        Log.info("Verifying page title...");
        System.out.println("Title of the page is : " + driver.getTitle());
    }
}
