package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;

    private static GoogleResults googleResults;// [1]

    public GoogleSearch(WebDriver driver) {                  // [2]
        super(driver);
    }
    public void searchResults() {

        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);                          // [2]
        googleResults.isSeeResults();                                   // [3]

    }
    public GoogleResults loadResults(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }
}
