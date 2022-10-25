package org.selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser {
    public static void main(String[] args) {
        // configuring the browser
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        // Instantiation .... object creation
        WebDriver driver = new ChromeDriver();
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
