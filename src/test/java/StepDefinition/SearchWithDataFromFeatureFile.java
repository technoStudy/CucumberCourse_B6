package StepDefinition;

import io.cucumber.java.en.*;

public class SearchWithDataFromFeatureFile {

    @When("User search for {string}")
    public void user_search_for(String searchItem) {
        System.out.println("User search for: " + searchItem);
    }

    @Then("All the results should be displayed for {string}")
    public void all_the_results_should_be_displayed_for(String searchResultItem) {
        System.out.println("User got results related to: " + searchResultItem);
    }


}
