package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        WebElement acceptField = driver.findElement(By.cssSelector("._9f0v0._jkrtd.mj7a_0.mh36_16.mvrt_16.mg9e_16.mpof_ki.m389_6m.munh_56.m3h2_56.myre_zn.myre_8v_s.m7f5_5x_s.mjru_vb._854c2_OPWNL > button"));
        acceptField.click();

        WebElement inputField = driver.findElement(By.cssSelector(".mr3m_1.mli2_1.mjyo_6x.mse2_40.mqu1_40.mp4t_0.m3h2_0.mryx_0.munh_0.mg9e_0.mj7a_0.mh36_0.mvrt_8.mlkp_ag.mefy_5r.mldj_0.mm2b_0._14uqc.mgmw_q3.mh85_0._d25db_1gH6X"));
        inputField.sendKeys("Mavic mini");


        WebElement categoryCombo = driver.findElement(By.cssSelector(".mr3m_1.m7er_k4.mj6k_n7._k70df.mgn2_14.mp0t_0a.mqu1_21.mgmw_wo.mli8_k4"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);

        WebElement searchField = driver.findElement(By.cssSelector("._13q9y._8tsq7._1q2ua.mr3m_0.mli2_0.mh85_0.mh85_56_m.msbw_0.mtag_0._d25db_3gMDr"));
        searchField.click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("allegro.listing.sort")));


        List<WebElement> elements = driver.findElements(By.cssSelector("section>article"));
        System.out.println(elements.get(18).getText());
    }
}