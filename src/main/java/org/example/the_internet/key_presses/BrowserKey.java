package org.example.the_internet.key_presses;

import org.example.the_internet.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BrowserKey implements Browser {

    public static String pressKey() {
        WebElement input = driver.findElement(By.id("target"));
        input.click();
        input.sendKeys("Q");

        WebElement result = driver.findElement(By.id("result"));

        return result.getText();
    }
}
