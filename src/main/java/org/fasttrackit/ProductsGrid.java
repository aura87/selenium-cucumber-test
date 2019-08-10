package org.fasttrackit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductsGrid {

    @FindBy(css = "h2.product-name a")
    private List<WebElement> productsNames;

    @FindBy(className = "price")
    private List<WebElement> productPrices;

    @FindBy(xpath = "//select[@title='Sort By']")
    private WebElement sortByList;

    @FindBy(className = "sort-by-switcher")
    private WebElement sortDirectionButton;

    public List<WebElement> getProductsNames() {
        return productsNames;
    }

    public Select getSortByList() {
        return new Select(sortByList);
    }

    public WebElement getSortDirectionButton() {
        return sortDirectionButton;
    }

    public List<WebElement> getProductPrices() {
        return productPrices;
    }
}
