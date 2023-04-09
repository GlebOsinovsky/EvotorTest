package com.evator.pageobjects.MainPage;


import com.evator.pageobjects.Dialog.BaseDialog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class BasePage {
    private final WebDriver driver;
    private final By addToCartButton = By.xpath("//button[contains(@class, 'basket-button')]");
    private final By cartButton = By.xpath("//evo-header-basket-button[@class='header__button header__button_basket']");

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public BaseDialog clickAddToCartButton() {
        WebElement button = driver.findElement(addToCartButton);
        button.click();
        return new BaseDialog(driver);

    }

    public void clickCartButton() {
        WebElement button = driver.findElement(cartButton);
        button.click();
    }

    public BasePage open() {
        driver.get("https://market.evotor.ru/store/apps/e7e1a9af-d0ad-4dec-97ce-8b27805c145d");
        return new BasePage(driver);
    }
    public boolean isPageLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Эвотор | Страница приложения Маркировка"));
        WebElement addToCartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class, 'basket-button')]")));
        return addToCartButton.isDisplayed();
    }
}
