package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Log;

public class LoginPage {

    private final WebDriver driver;
    private final By usernameTextBox = By.id("Email");
    private final By passwordTextBox = By.id("Password");
    private final By loginButton = By.xpath("/html/body/div[6]/main/div/section/div/div[2]/div[1]/div/form/div[3]/button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(usernameTextBox).clear();
        driver.findElement(usernameTextBox).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordTextBox).clear();
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickLogin() {
        Log.info("Clicking login button...");
        driver.findElement(loginButton).click();
    }

}
