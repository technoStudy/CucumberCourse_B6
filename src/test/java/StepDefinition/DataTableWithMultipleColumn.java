package StepDefinition;

import io.cucumber.java.en.*;

import java.util.List;

public class DataTableWithMultipleColumn {

    @Given("User navigate to login page")
    public void user_navigate_to_login_page() {
        System.out.println("User navigate to Login page");
    }

    @When("User enter invalid email address and password")
    public void user_enter_invalid_email_address_and_password(io.cucumber.datatable.DataTable dataTable) {
//       { {"test@techno.com" ,"123456789"}, {"admin@techno.com", "asdfghjkl"} }
        List<List<String>> testData = dataTable.asLists();

        for (List<String> data : testData) {
            System.out.println("Username: " + data.get(0));
            System.out.println("Password: " + data.get(1));
        }
    }

    @Then("Error message should be displayed")
    public void error_message_should_be_displayed() {

    }


}
