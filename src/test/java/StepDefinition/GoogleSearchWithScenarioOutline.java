package StepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class GoogleSearchWithScenarioOutline {

    WebDriver driver;

    @Given("User navigate to Google.com")
    public void user_navigate_to_google_com() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");
    }

    @When("User search for {string} in Google.com")
    public void user_search_for_in_google_com(String searchItem) {
        WebElement searchInput = driver.findElement(By.cssSelector("input[title='Search']"));
        searchInput.sendKeys(searchItem);

        WebElement searchButton = driver.findElement(By.cssSelector("input[value='Google Search']"));
        searchButton.click();
    }

    @Then("User should see results related to {string}")
    public void user_should_see_results_related_to(String resultItem) {
        WebElement result = driver.findElement(By.xpath("//a//h3"));

        Assert.assertTrue(result.getText().toLowerCase().contains(resultItem.toLowerCase()));

        driver.quit();
    }

}
