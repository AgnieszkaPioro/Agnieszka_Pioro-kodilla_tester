package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage{


    @FindBy(css = "div[class='g']")                  // [1]
    private List<WebElement> results;                // [2]

    public GoogleResults(WebDriver driver) {         // [3]
        super(driver);                                // [4]
        PageFactory.initElements(this.driver, this);  // [5]
    }
    public void isSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }
    public WebElement randomResult(){
        Random random = new Random();
        int randomSearch = random.nextInt(results.size());
        WebElement webElement = results.get(randomSearch);
        webElement.getTagName();
        return results.get(randomSearch);

    }
}
