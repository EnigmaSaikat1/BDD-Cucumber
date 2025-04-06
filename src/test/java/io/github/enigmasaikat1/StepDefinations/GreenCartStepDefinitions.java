package io.github.enigmasaikat1.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GreenCartStepDefinitions {
    protected WebDriver driver;

    @Given("User is on GreenCart Landing Page")
    public void user_is_on_green_cart_landing_page() {
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @When("User searched with shortname {string} and extracted actual name of product")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String string) {
        try {
            System.out.println("Searching for: " + string);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Then("User searched for same shortname in offers page to check if product exist")
    public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist() {
        try{
            System.out.println("Checking if product exists");
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
