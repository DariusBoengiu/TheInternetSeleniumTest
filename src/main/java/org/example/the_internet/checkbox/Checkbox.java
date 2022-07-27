package org.example.the_internet.checkbox;

import org.example.the_internet.Browser;

public class Checkbox {

    static String url = "http://the-internet.herokuapp.com/checkboxes";

    static String title = "The Internet";

    public static void goTo() {
        Browser.goTo(url);
    }

    public static boolean isAt() {
        return Browser.title().equals(title);
    }

    public static boolean check() {
        return BrowserCheckbox.checkBox1();
    }






}
