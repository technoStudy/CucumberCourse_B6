package StepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleSearchSteps {

    WebDriver driver;

    @Given("User navigate to Google")
    public void user_navigate_to_google() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @When("User search for Cucumber in Google")
    public void user_search_for_cucumber_in_google() {
        WebElement searchInput = driver.findElement(By.cssSelector("input[title='Search']"));
        searchInput.sendKeys("Cucumber");

//        WebElement googleSearchButton = driver.findElement(By.cssSelector("input[value='Google Search']"));
//        googleSearchButton.click();

        searchInput.sendKeys(Keys.ENTER);

    }

    @Then("User should see Cucumber results in Google")
    public void user_should_see_cucumber_results_in_google() {
        WebElement searchResult = driver.findElement(By.tagName("h3"));

        System.out.println("Search Result text: " + searchResult.getText());
        Assert.assertTrue(searchResult.getText().toLowerCase().contains("cucumber"));

        driver.quit();
    }

}
