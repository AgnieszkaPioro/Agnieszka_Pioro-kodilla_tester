//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import pages.GoogleSearch;
//
//public class TestRandom {
//
//    WebDriver driver;
//
//    @Before
//    public void testSetup() {
//        System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
//        driver = new FirefoxDriver();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        driver.navigate().to("http://www.google.com");
//        WebElement acceptField = driver.findElement(By.id("L2AGLb"));
//        acceptField.click();
//    }
//
//    @After
//    public void tearDown() {
//        driver.close();                   // [1]
//    }
//
//    @Test
//    public void testGooglePage() {
//        GoogleSearch googleSearch = new GoogleSearch(driver);
//        googleSearch.searchResults();
//    }
//}
//
