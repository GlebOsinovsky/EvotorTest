package com.evotor.base;


import com.evator.pageobjects.Dialog.BaseDialog;
import com.evator.pageobjects.MainPage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.time.Duration;


public class EvotorBaseTest {
    protected WebDriver driver;


    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    void baseTest() {

        BasePage mainPage = new BasePage(driver).open();
        Assert.assertTrue(mainPage.isPageLoaded(), "страница не открылась");

        BaseDialog dialogPage = mainPage.clickAddToCartButton();
        mainPage.clickCartButton();
        Assert.assertTrue(dialogPage.hasItem("Маркировка"), "Товар в корзине не найден");
    }

    @AfterTest
    public void tearDown() {
         driver.close();
         driver.quit();
    }
}
