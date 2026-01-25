package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;
import pageObjects.PracticeFormPage;

public class BaseSteps {

    public WebDriver driver = new ChromeDriver();
    public LoginPage loginPage = new LoginPage(driver);
    public PracticeFormPage practiceFormPage = new PracticeFormPage(driver);

}
