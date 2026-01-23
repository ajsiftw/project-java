package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage {

    public WebDriver driver;

    public LoginPage (WebDriver thisDriver){
        driver = thisDriver;
        PageFactory.initElements(thisDriver, this);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @FindBy(id = "userName")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id = "password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(id = "login")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    @CacheLookup
    WebElement btnLogout;

    public void setUserName(String username) {
        txtEmail.clear();
        txtEmail.sendKeys(username);
    }

    public void setPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void clickLogin( ) {
        btnLogin.click();
    }

    public void clickLogout( ) {
        btnLogout.click();
    }

}
