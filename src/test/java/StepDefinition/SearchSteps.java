package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

    @Given("User go to Search page")
    public void user_go_to_search_page() {
        System.out.println("Go to Search page");
    }

    @When("User search for Cucumber")
    public void user_search_for_cucumber() {
        System.out.println("Search for Cucumber");
    }

    @Then("All the results should be displayed for Cucumber")
    public void all_the_results_should_be_displayed_for_cucumber() {
        System.out.println("Results displayed");
    }

    @When("User search for SDET")
    public void user_search_for_sdet() {
        System.out.println("Search for SDET");
    }

    @Then("All the results should be displayed for SDET")
    public void all_the_results_should_be_displayed_for_sdet() {
        System.out.println("Results displayed");
    }

}
