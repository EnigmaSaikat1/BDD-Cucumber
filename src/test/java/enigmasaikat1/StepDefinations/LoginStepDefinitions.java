package enigmasaikat1.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {
    @Given("User navigates to the Login page")
    public void user_navigates_to_the_login_page() {
        try {
            System.out.println("User navigates to the Login page");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @When("User successfully enters the Login details")
    public void user_successfully_enters_the_login_details() {
        try {
            System.out.println("User successfully enters the Login details");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Then("User Should able to view the product category page")
    public void user_should_able_to_view_the_product_category_page() {
        try {
            System.out.println("User Should able to view the product category page");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
