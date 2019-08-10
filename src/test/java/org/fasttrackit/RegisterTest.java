package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

    public class RegisterTest {
    @Test

    public void successfulRegisterWithAllDetails() {

        WebDriver driver = null;

        driver.findElement(By.id("firstname")).sendKeys("Aura");
        driver.findElement(By.id("lastname")).sendKeys("Cordis");
        driver.findElement(By.name("email")).sendKeys("test@example.com");
        driver.findElement(By.name("email")).sendKeys("test" + System.currentTimeMillis() + "@example.com");
        driver.findElement(By.name("password")).sendKeys("passw0rd");
        driver.findElement(By.name("confirmation")).sendKeys("passw0rd");
        driver.findElement(By.className("checkbox")).click();
        driver.findElement(By.xpath("//div[@class='account-create']//button[@title='Register']")).click();

        WebElement successMessageContainer = driver.findElement(By.className("success-msg"));

        assertThat("Confirmation message not displayed.", successMessageContainer, notNullValue());
        assertThat("Unexpected confirmation message.", successMessageContainer.getText(),
                is("Thank you for registering with Madison Island."));

        driver.quit();
    }
}

