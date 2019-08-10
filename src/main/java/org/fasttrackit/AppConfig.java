package org.fasttrackit;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

    private static Properties properties = new Properties();

    static  {
        String enviroment = System.getProperty("env", "production");
        InputStream imputStream = AppConfig.class.getClassLoader().getResourceAsStream(enviroment + ".properties");
        try {
            properties.load(imputStream);
        } catch (IOException e) {
            System.out.println("Faild to load properties from configuration file.");
        }

    }

    private static String chromeDriverPath = properties.getProperty("chrome.driver.path");
    private static String geckoDriverPath = properties.getProperty("gecko.driver.path");
    private static String siteUrl = properties.getProperty("site.url");
    private static String internetExplorerDriverPath = properties.getProperty("ie.driver.path");

    public static String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public static String getGeckoDriverPath() {
        return geckoDriverPath;
    }

    public static String getSiteUrl() {

        return siteUrl;
    }

    public static String getInternetExplorerDriverPath() {
        return internetExplorerDriverPath;
    }
}

