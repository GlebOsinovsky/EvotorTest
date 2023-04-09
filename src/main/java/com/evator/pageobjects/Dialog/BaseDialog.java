package com.evator.pageobjects.Dialog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import java.util.List;

public class BaseDialog {
    private final WebDriver driver;

    private final By ProductInCart = By.xpath("//div[@class='basket-item__info']");

    public BaseDialog(WebDriver driver) {
        this.driver = driver;
    }


    public boolean hasItem(String itemName) {
        List<WebElement> items = driver.findElements(ProductInCart);
        for (WebElement item : items) {
            if (item.getText().contains(itemName)) {
                return true;
            }
        }
        return false;
    }

}
