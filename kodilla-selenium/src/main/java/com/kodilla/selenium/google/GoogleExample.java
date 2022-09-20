package com.kodilla.selenium.google;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver", "c:\\selenium-drivers\\firefox\\geckodriver.exe");      // [1]
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        WebElement inputField = driver.findElement(By.id("L2AGLb")); // [4]
        inputField.click();
        WebElement inputField2 = driver.findElement(By.name("q"));
        inputField2.sendKeys("kodilla");
        inputField2.submit();
    }
    }


