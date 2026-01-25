package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class PracticeFormPage {

    public WebDriver driver;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    By menuForms = By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/span/div/div[1]");
    By menuPracticeForm = By.xpath("//*[contains(text(),'Practice Form')]");
    By txtFirstName = By.id("firstName");
    By txtLastName = By.id("lastName");
    By txtEmail = By.id("userEmail");
    By radioGenderMale = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label");
    By radioGenderFemale = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label");
    By radioGenderOther = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[3]/label");
    By txtMobile = By.id("userNumber");
    By calendarDateOfBirth = By.id("dateOfBirthInput");
    By calendarMonth = By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select");
    By calendarYear = By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select");
    By calendarDay = By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[3]");
    By txtSubjects = By.id("subjectsInput");
    By checkboxHobbiesSports = By.cssSelector("label[for='hobbies-checkbox-1']");
    By checkboxHobbiesReading = By.cssSelector("label[for='hobbies-checkbox-1']");
    By checkboxHobbiesMusic = By.cssSelector("label[for='hobbies-checkbox-1']");
    By uploadPicture = By.id("uploadPicture");
    By txtCurrentAddress = By.id("currentAddress");
    By selectState = By.id("react-select-3-input");
    By selectCity = By.id("react-select-4-input");
    By buttonSubmit = By.id("submit");

    public void clickForms() {
        driver.findElement(menuForms).click();
    }

    public void clickPracticeForm() {
        driver.findElement(menuPracticeForm).click();
    }

    public void addFirstName(String firstName) {
        driver.findElement(txtFirstName).sendKeys(firstName);
    }

    public void addLastName(String lastName) {
        driver.findElement(txtLastName).sendKeys(lastName);
    }

    public void addEmail(String email) {
        driver.findElement(txtEmail).sendKeys(email);
    }

    public void clickGenderMale() {
        driver.findElement(radioGenderMale).click();
    }

    public void clickGenderFemale() {
        driver.findElement(radioGenderFemale).click();
    }

    public void clickGenderOther() {
        driver.findElement(radioGenderOther).click();
    }

    public void addMobile(String mobile) {
        driver.findElement(txtMobile).sendKeys(mobile);
    }

    public void clickDateOfBirth( String year, String month) {
        driver.findElement(calendarDateOfBirth).click();
        WebElement monthElement = driver.findElement(calendarMonth);
        Select monthSelect = new Select(monthElement);
        monthSelect.selectByVisibleText(month);
        WebElement yearElement = driver.findElement(calendarYear);
        Select yearSelect = new Select(yearElement);
        yearSelect.selectByVisibleText(year);
        driver.findElement(calendarDay).click();
    }

    public void addSubject(String subjects) {
        WebElement element = driver.findElement(txtSubjects);
        element.sendKeys(subjects);
        element.sendKeys(Keys.ENTER);
    }

    public void clickHobbiesSports() {
        driver.findElement(checkboxHobbiesSports).click();
    }

    public void clickHobbiesReading() {
        driver.findElement(checkboxHobbiesReading).click();
    }

    public void clickHobbiesMusic() {
        driver.findElement(checkboxHobbiesMusic).click();
    }

    public void clickUploadPicture() {
        WebElement upload = driver.findElement(uploadPicture);
        upload.sendKeys("C:\\Users\\ajsif\\Downloads\\img13.jpg");
    }

    public void addCurrentAddress(String currentAddress) {
        driver.findElement(txtCurrentAddress).sendKeys(currentAddress);
    }

    public void selectState(String state) {
        WebElement dropdownElement = driver.findElement(selectState);
        dropdownElement.sendKeys(state);
        dropdownElement.sendKeys(Keys.ENTER);
    }

    public void selectCity(String city) {
        WebElement dropdownElement = driver.findElement(selectCity);
        dropdownElement.sendKeys(city);
        dropdownElement.sendKeys(Keys.ENTER);
    }

    public void clickSubmit() {
        driver.findElement(buttonSubmit).click();
    }

}
