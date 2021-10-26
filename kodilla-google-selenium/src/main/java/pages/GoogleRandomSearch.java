package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GoogleRandomSearch extends AbstractPage {

    @FindBy(css = "div[class='g']")
    static WebElement webElement;

    public GoogleRandomSearch(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public WebElement randomSearch(WebElement googleResults) {
        webElement = googleResults;
        webElement.click();
        return webElement;
    }
}
