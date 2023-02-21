package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserManager;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
    WebElement click;

    public WebElement getClick() {
        return click;
    }

    public WebElement getSearchResult() {
        return SearchResult;
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    @FindBy(xpath = "//input[@class='_3704LK']")
    WebElement searchBox;

    @FindBy(xpath = "//button [@class='L0Z3Pu']")
    WebElement ClickOn;

    public WebElement getClickOn() {
        return ClickOn;
    }

    @FindBy(xpath = "//span[@class=\"_10Ermr\"]//span")
    WebElement SearchResult;

    @FindBy(xpath = "//div[text()='Price -- Low to High']")
    WebElement ClickInfo;

    public WebElement getClickInfo() {
        return ClickInfo;
    }

    @FindBy(xpath = "//span[@class=\"_10Ermr\"]//span")
    WebElement result;

    public WebElement getResult() {
        return result;
    }

    @FindBy(xpath = "//div[text()='Infinix HOT 20 Play (Fantasy Purple, 64 GB)']")
    WebElement clickScreen;

    public WebElement getClickScreen() {
        return clickScreen;
    }

    public WebElement getDisplayed() {
        return displayed;
    }

    @FindBy(xpath ="(//div[@class=\"_1YokD2 _2GoDe3\"])[1]")
    WebElement displayed;

    @FindBy(xpath = "//div[text()='Price -- High to Low']")
    WebElement tap;

    public WebElement getTap() {
        return tap;
    }

    public WebElement getDisplay() {
        return display;
    }

    @FindBy(xpath = "//span[@class=\"_10Ermr\"]//span")
    WebElement display;

    @FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
    WebElement clack;

    public WebElement getClack() {
        return clack;
    }

    @FindBy(xpath = "//input[@class='_3704LK']")
    WebElement searchbar;

    public WebElement getSearchbar() {
        return searchbar;
    }

    @FindBy(xpath = "//button [@class='L0Z3Pu']")
    WebElement output;

    public WebElement getOutput() {
        return output;
    }

    public WebElement getPop() {
        return pop;
    }

    @FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
    WebElement pop;

    @FindBy(xpath = "//input[@class='_3704LK']")
    WebElement explore;

    public WebElement getExplore() {
        return explore;
    }

    @FindBy(xpath = "//button[@class='L0Z3Pu']")
    WebElement snap;

    public WebElement getSnap() {
        return snap;
    }

    @FindBy(xpath = "//span[@class=\"_10Ermr\"]//span")
    WebElement outcome;

    public WebElement getOutcome() {
        return outcome;
    }
}
