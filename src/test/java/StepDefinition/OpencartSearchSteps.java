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

public class OpencartSearchSteps {

    WebDriver driver;

    @Given("User navigate to Opencart website")
    public void user_navigate_to_opencart_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://opencart.abstracta.us/");

    }

    @When("User search for {string} in Opencart")
    public void user_search_for_in_opencart(String searchInput) {
        WebElement searchPlaceholder = driver.findElement(By.cssSelector("#search>input"));
        searchPlaceholder.sendKeys(searchInput);

        WebElement searchButton = driver.findElement(By.cssSelector("#search>span>button"));
        searchButton.click();

    }

    @Then("All the results in Opencart should be related to {string}")
    public void all_the_results_in_opencart_should_be_related_to(String resultItem) {
        List<WebElement> resultItemList = driver.findElements(By.xpath("//h4"));

        for (WebElement item : resultItemList) {
            Assert.assertTrue(item.getText().toLowerCase().contains(resultItem.toLowerCase()));
        }

        driver.quit();

    }

}
