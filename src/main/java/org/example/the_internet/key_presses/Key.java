package org.example.the_internet.key_presses;

import org.example.the_internet.Browser;
import org.example.the_internet.input.BrowserInput;

public class Key {

    static String url = "http://the-internet.herokuapp.com/key_presses";

    static String title = "The Internet";

    public static void goTo() {
        Browser.goTo(url);
    }

    public static boolean isAt() {
        return Browser.title().equals(title);
    }

    public static String press() {
        return BrowserKey.pressKey();
    }
}
