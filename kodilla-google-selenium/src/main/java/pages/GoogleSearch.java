package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;

    @FindBy(css = "div[class='g']")
    static List<WebElement> results;


    private static GoogleResults googleResults;// [1]

    public GoogleSearch(WebDriver driver) {                  // [2]
        super(driver);
    }
    public void searchResults() {
//    public static void main(String[] args) {
        Random random = new Random();
//        System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
//        driver.navigate().to("http://www.google.com");
//        WebElement acceptField = driver.findElement(By.id("L2AGLb"));
//        acceptField.click();
        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);                          // [2]
        googleResults.isSeeResults();                                   // [3]
        System.out.println(results.get(0).getText());
        WebElement webElement = results.get(random.nextInt(9)).findElement(By.className("DKV0Md"));
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
        webElement.click();
    }
    public GoogleResults loadResults(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }
}
