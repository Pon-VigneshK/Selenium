package org.selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_browser {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
        // to maximize window
        driver.manage().window().maximize();
        // to delete all cookies
        driver.manage().deleteAllCookies();
        // to pass a URL
        driver.get("https://katalon-demo-cura.herokuapp.com");
        // to fetch a title
        String title = driver.getTitle();
        System.out.println(title);
        // to fetch a current URL
        String url = driver.getCurrentUrl();
        System.out.println(url);
        // to close the browser
        driver.quit();
    }
}
