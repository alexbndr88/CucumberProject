package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Aigul_Branches;
import utilities.Driver;

public class SupplySync_AigulSteps {
    Aigul_Branches branches = new Aigul_Branches();
    private static final Logger logger =
            LogManager.getLogger(SearchBarSteps.class);
    WebDriver driver = Driver.getDriver();
    Faker faker = new Faker();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver.get("https://supplysync.us/login");
}
    @When("the user enters the username {string}")
    public void the_user_enters_the_username(String name) {
        branches.loginBtn.sendKeys("admin@codewise.com");
    }
    @When("the user enters the password {string}")
    public void the_user_enters_the_password(String string) {
        branches.passwordBtn.sendKeys("codewise123");
    }
    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        branches.singInBtn.click();
    }
    @Then("the user should be logged in")
    public void the_user_should_be_logged_in() {

    }
    @Given("the user is on the branches page")
    public void the_user_is_on_the_branches_page() {
        branches.branchesBtn.click();
    }
    @When("the user clicks on the create branch button")
    public void the_user_clicks_on_the_create_branch_button() {
        branches.createBranch.click();
    }
    @When("user enters the branch name {string}")
    public void user_enters_the_branch_name(String string) {
        branches.branchName.sendKeys("Branches For Testing");
    }

    @When("user enters the email {string}")
    public void user_enters_the_email(String string) {
        branches.email.sendKeys(faker.internet().emailAddress());
    }

    @When("user enters the address {string}")
    public void user_enters_the_address(String string) {
        branches.address.sendKeys(faker.address().fullAddress());
    }

    @When("user enters the phone number {string}")
    public void user_enters_the_phone_number(String string) {
        branches.phoneNumber.click();
        branches.phoneNumber.sendKeys(faker.phoneNumber().phoneNumber());
    }

    @When("user enters the location of the branch {string}")
    public void user_enters_the_location_of_the_branch(String string) {
        branches.city.sendKeys(faker.address().city());
    }

    @When("user select region {string}")
    public void user_select_region(String string) {
        branches.region.click();
    }

    @When("user to choose companies {string}")
    public void user_to_choose_companies(String string) {
        branches.illinois.click();
    }

    @Given("clicks on the edit button")
    public void clicks_on_the_edit_button() {
        branches.companies.click();
    }
    @When("the user clicks on the create button")
    public void the_user_clicks_on_the_create_button() {
        branches.createBtn.click();
    }
    @Then("the user should see the message {string}")
    public void the_user_should_see_the_message(String string) {
        Assert.assertEquals("Branches For Testing", branches.checkBranchName.getText());
    }@Then("clicks on the email")
    public void clicks_on_the_email() {

    }
    @Then("add new email {string}")
    public void add_new_email(String string) {
        branches.email.sendKeys("aigul111@gmail.com");
    }

    @Then("add city {string}")
    public void add_city(String string) {
        branches.city.sendKeys("Chicago");
    }

    @Then("clicks save button")
    public void clicks_save_button() {
        branches.saveBtn.click();
    }

    @Then("verify the message {string}")
    public void verify_the_message(String string) {

    }


}
