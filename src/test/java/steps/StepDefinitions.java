package steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HomePage;
import utils.BrowserManager;
import utils.QaProps;
import utils.TestReader;

import java.util.HashMap;

public class StepDefinitions {

    private WebDriver driver;
    String url;
    HomePage homePage;
    HashMap<String, String> data;
    Scenario scenario;


    public StepDefinitions(BrowserManager browserManager){
        this.driver = browserManager.getDriver();
    }

    @Before(order = 1)public void before(Scenario scenario){    this.scenario = scenario;}
    @Given("the user navigates to the home page")
    public void the_user_navigates_to_the_home_page() {
        url = QaProps.getValue("url");
        driver.get(url);
        data =  TestReader.getData(scenario.getName());




    }
    @When("the user enter the product name")
    public void the_user_enter_the_product_name() throws  InterruptedException {
       homePage = new HomePage(driver);
       Thread.sleep(2000);
        homePage.getClick().click();
        homePage.getSearchBox().sendKeys(data.get("testvalue"));
        homePage.getClickOn().click();


    }
    @Then("the product result should be displayed")
    public void the_product_result_should_be_displayed() {
        String text = homePage.getSearchResult().getText();
        Assert.assertEquals(text,"mobiles");
    }



    @And("the user should display the page")
    public void theUserShouldDisplayThePage() {
        homePage.getClickInfo().click();

    }
    @Then("user should able to sort the product by price")
    public void userShouldAbleToSortTheProductByPrice() {
        String text = homePage.getResult().getText();
        Assert.assertEquals(text,"mobiles");

    }


    @And("the user see the page")
    public void theUserSeeThePage() {
        homePage.getClickScreen().click();
    }

    @Then("the product open should be displayed")
    public void theProductOpenShouldBeDisplayed() {
        WebElement text = homePage.getDisplayed();
        Assert.assertTrue(text.isDisplayed());


    }
    @And("the user should see the page")
    public void theUserShouldSeeThePage() {
        homePage.getTap().click();
    }


    @Then("user should able to sort the product by price high to low")
    public void userShouldAbleToSortTheProductByPriceHighToLow() {
        String text = homePage.getDisplay().getText();
        Assert.assertEquals(text,"mobiles");
    }

    @When("the user  write the product name")
    public void theUserEnterWriteTheProductName() {
        homePage = new HomePage(driver);
        homePage.getClack().click();
        homePage.getSearchbar().sendKeys("xyz2234bh");

    }


    @Then("the result should displayed")
    public void theResultShouldDisplayed() {
        homePage.getOutput().click();

    }


    @When("the user enters {string}")
    public void theUserEnters(String product1) throws InterruptedException {
        homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.getPop().click();
        homePage.getExplore().sendKeys(product1);
        homePage.getSnap().click();


    }

    @Then("user display the message")
    public void userDisplayTheMessage() {
        WebElement text = homePage.getOutcome();
        Assert.assertTrue(text.isDisplayed());

    }
}
