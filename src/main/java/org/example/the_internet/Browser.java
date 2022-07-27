package org.example.the_internet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface Browser {

    WebDriver driver = new ChromeDriver();

    static void goTo(String url) {
        driver.get(url);
    }

    static String title() {
        return driver.getTitle();
    }
}
