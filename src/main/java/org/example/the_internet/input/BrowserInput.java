package org.example.the_internet.input;

import org.example.the_internet.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BrowserInput implements Browser {


    public static String send() {
        String value = "";
        WebElement searchField = driver.findElement(By.cssSelector("input[type=number]"));
        searchField.click();
        searchField.sendKeys(value);
        searchField.sendKeys(Keys.ENTER);

        return searchField.getAttribute("value");
    }
}
