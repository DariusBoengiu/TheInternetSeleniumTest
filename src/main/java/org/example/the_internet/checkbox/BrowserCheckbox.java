package org.example.the_internet.checkbox;

import org.example.the_internet.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserCheckbox implements Browser {


    public static boolean checkBox1() {
        WebElement checkBox = driver.findElement(By.cssSelector("input[type=checkbox]"));

        checkBox.click();

        return checkBox.isSelected();

    }


}
