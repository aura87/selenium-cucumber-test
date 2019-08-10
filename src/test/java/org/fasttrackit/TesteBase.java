package org.fasttrackit;

import org.openqa.selenium.WebDriver;

public class TesteBase {

    protected WebDriver driver = DriverFactory.getDriver();

    public void openHomepage() {
        driver.get(AppConfig.getSiteUrl());
    }
}
