package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

public class WishListTest {

    @Test
     public void addToWishListAsAnonymousUser() {
        WebDriver driver = null;
        driver.findElement(By.linkText("VIEW DETAILS")).click();
        driver.findElement(By.linkText("Add to Wishlist")).click();

        WebElement pageTitleContainer = driver.findElement(By.cssSelector(".page-title h1"));

        assertThat("Page title not displayed.", pageTitleContainer, notNullValue());
        assertThat("User hasn't been redirected to the login/register page", pageTitleContainer.getText(),
                containsString("LOGIN OR CREATE AN ACCOUNT"));

        driver.quit();
    }
}
