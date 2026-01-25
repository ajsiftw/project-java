package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import java.util.Objects;

public class Steps extends BaseSteps{

    @Before
    public void setup() {
        System.out.println("Tests Start Here");
    }

    @After
    public void tearDown() {
        System.out.println("Tests End Here");
    }

    @Given("User launches chrome browser")
    public void user_launches_chrome_browser() {
        System.out.println("User launches chrome browser");
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
        Assert.assertEquals(title, driver.getTitle());
    }

    @When("User clicks on logout link")
    public void user_clicks_on_logout_link() {
        loginPage.clickLogout();
    }

    @Then("User closes browser")
    public void user_closes_browser() {
        driver.quit();
    }

    @When("User clicks on forms")
    public void user_clicks_on_forms() {
        practiceFormPage.clickForms();
    }

    @When("User clicks on practice form")
    public void user_clicks_on_practice_form() {
        practiceFormPage.clickPracticeForm();
    }

    @Then("Page contains text {string}")
    public void page_contains(String text) {
        Assert.assertTrue (Objects.requireNonNull(driver.getPageSource()).contains(text));
    }

    @When("User enters first name as {string} and last name as {string}")
    public void user_enters_first_name_as_and_last_name_as(String firstName, String lastName) {
        practiceFormPage.addFirstName(firstName);
        practiceFormPage.addLastName(lastName);
    }

    @When("User enters email as {string}")
    public void user_enters_email_as(String email) {
        practiceFormPage.addEmail(email);
    }

    @When("User selects a gender as {string}")
    public void user_selects_a_gender_as(String gender) {
        if (gender.equals("male")) {
            practiceFormPage.clickGenderMale();
        } else if (gender.equals("female")) {
            practiceFormPage.clickGenderFemale();
        } else if (gender.equals("other")) {
            practiceFormPage.clickGenderOther();
        } else {
            practiceFormPage.clickGenderOther();
        }
    }

    @When("User enters his phone number as {string}")
    public void user_enters_his_phone_number_as(String mobile) {
        practiceFormPage.addMobile(mobile);
    }

    @When("User select his birth date as year {string} month {string} day 23rd")
    public void user_select_his_birth_date_as_year_month_day(String year, String month) {
        practiceFormPage.clickDateOfBirth(year, month);
    }

    @When("User adds his subjects as {string}")
    public void user_adds_his_subjects_as(String subjects) {
        practiceFormPage.addSubject(subjects);
    }

    @When("User selects his hobbies as {string}")
    public void user_selects_his_hobbies_as(String hobbies) {
        if (hobbies.equals("sports")) {
            practiceFormPage.clickHobbiesSports();
        } else if (hobbies.equals("reading")) {
            practiceFormPage.clickHobbiesReading();
        } else if (hobbies.equals("music")){
            practiceFormPage.clickHobbiesMusic();
        } else {
            practiceFormPage.clickHobbiesReading();
        }
    }

    @When("User uploads a picture")
    public void user_uploads_a_picture() {
        practiceFormPage.clickUploadPicture();
    }

    @When("User adds his address as {string}")
    public void user_adds_his_address_as(String currentAddress) {
        practiceFormPage.addCurrentAddress(currentAddress);
    }

    @When("User selects a state as {string} and a city as {string}")
    public void user_selects_a_state_as_and_a_city_as(String state, String city) {
        practiceFormPage.selectState(state);
        practiceFormPage.selectCity(city);
    }

    @When("User clicks submit")
    public void user_clicks_submit() {
        practiceFormPage.clickSubmit();
    }

}
