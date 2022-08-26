package StepDefinition;

import io.cucumber.java.en.*;

public class SearchWithScenarioOutline {

    @Given("User navigate to Test website")
    public void user_navigate_to_test_website() {
        System.out.println("Navigate to Test Website!");
    }

    @When("User search for {string} in test website")
    public void user_search_for_in_test_website(String searchItem) {
        System.out.println("Search for: " + searchItem);
    }

    @Then("User should see results for {string} in test website")
    public void user_should_see_results_for_in_test_website(String resultItem) {
        System.out.println("Result items: " + resultItem);
    }

}
