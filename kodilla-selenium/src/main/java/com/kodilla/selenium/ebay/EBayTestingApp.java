package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        WebElement inputField = driver.findElement(By.name("_nkw"));
        inputField.sendKeys("laptop");

        WebElement clickField = driver.findElement(By.id("gh-btn"));
        clickField.click();
    }

//    https://github.com/AgnieszkaPioro/Agnieszka_Pioro-kodilla_tester.git
}
