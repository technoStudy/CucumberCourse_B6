package StepDefinition;

import io.cucumber.java.en.*;

import java.util.List;

public class DataTableIntro {

    @Given("Navigate to website")
    public void navigate_to_website() {
        System.out.println("Navigate to website");
    }

    @When("User enter email address")
    public void user_enter_email_address(io.cucumber.datatable.DataTable dataTable) {
        // list = {"asdfghjkjhgfds", "1234567898765", "dksjhhfkjdshk7378"}
        List<String> testData = dataTable.asList();

        for (int i = 0; i < testData.size(); i++) {
            System.out.println("SendKeys --> " + testData.get(i));
        }
        
    }

    @Then("Close App")
    public void close_app() {
        System.out.println("Close app");
    }

}
