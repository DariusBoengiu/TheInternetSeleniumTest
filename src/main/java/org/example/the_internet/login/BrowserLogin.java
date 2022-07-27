package org.example.the_internet.login;

import org.example.the_internet.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BrowserLogin implements Browser {

    public static String login() {

        String user = "";
        String pass = "";

        WebElement username = driver.findElement(By.id("username"));
        username.click();
        username.sendKeys(user);

        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys(pass);

        WebElement loginButton = driver.findElement(By.cssSelector("input[type=submit]"));
        loginButton.click();

        WebElement flashMessage = driver.findElement(By.id("flash"));


        return flashMessage.getText();
    }
}
