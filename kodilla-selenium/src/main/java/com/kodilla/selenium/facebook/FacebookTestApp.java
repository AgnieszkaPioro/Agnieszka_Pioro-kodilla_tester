package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "c:\\selenium-drivers\\firefox\\geckodriver.exe");      // [1]
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");

        WebElement yearCombo = driver.findElement(By.xpath("//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);
    }
}
