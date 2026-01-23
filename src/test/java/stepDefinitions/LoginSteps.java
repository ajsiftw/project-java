package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;
import java.util.Objects;

public class LoginSteps {

    public WebDriver driver;
    public LoginPage loginPage;

    @Given("User launches chrome browser")
    public void user_launches_chrome_browser() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @When("User enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String username, String password) {
        loginPage.setUserName(username);
        loginPage.setPassword(password);
    }

    @When("User clicks login")
    public void user_clicks_login() {
        loginPage.clickLogin();
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String title) {
        if (Objects.requireNonNull(driver.getPageSource()).contains ("Invalid username or password!")) {
            driver.close();
            Assert.fail();
        } else {
            Assert.assertEquals(title, driver.getTitle());
        }
    }

    @When("User clicks on logout link")
    public void user_clicks_on_logout_link() {
        loginPage.clickLogout();
    }

    @Then("User closes browser")
    public void user_closes_browser() {
        driver.quit();
    }

}
