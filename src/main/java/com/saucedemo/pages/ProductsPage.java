package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductsPage.class.getName());

    public ProductsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement getTextProducts;

    @CacheLookup
    @FindBy(className = "inventory_item")
    List<WebElement> getTotalProductQty;


    public String verifyTextProducts() {
        log.info("Get Text Product" + getTextProducts.toString());
        return getTextFromElement(getTextProducts);
    }

    public int verifyTotalProductOfNumber() {
        int expectedQty = 6;
        List<WebElement> actualElement = getTotalProductQty;
        int actualQty = actualElement.size();
        System.out.println("Total Products displayed are: " + actualQty);
        log.info("Get Product Qty" + getTextProducts.toString());
        return actualQty;
    }
}
