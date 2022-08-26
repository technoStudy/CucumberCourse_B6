package StepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpencartSearchWithScenarioOutline {

    WebDriver driver;

    @Given("User navigate to Opencart")
    public void user_navigate_to_opencart() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://opencart.abstracta.us/");
    }

    @When("User search for {string} in Opencart website")
    public void user_search_for_in_opencart_website(String searchItem) {
        WebElement searchInput = driver.findElement(By.cssSelector("#search>input"));
        searchInput.sendKeys(searchItem);

        WebElement searchButton = driver.findElement(By.cssSelector("#search>span>button"));
        searchButton.click();
    }

    @Then("User should see results related to {string} in Opencart")
    public void user_should_see_results_related_to_in_opencart(String resultItem) {
        List<WebElement> results = driver.findElements(By.xpath("//h4"));

        for (WebElement item : results)
            Assert.assertTrue(item.getText().toLowerCase().contains(resultItem.toLowerCase()));

        driver.quit();

    }

}
