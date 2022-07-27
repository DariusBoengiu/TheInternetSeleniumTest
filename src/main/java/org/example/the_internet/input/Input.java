package org.example.the_internet.input;

import org.example.the_internet.Browser;

public class Input {

    static String url = "http://the-internet.herokuapp.com/inputs";

    static String title = "The Internet";

    public static void goTo() {
        Browser.goTo(url);
    }

    public static boolean isAt() {
        return Browser.title().equals(title);
    }

    public static String sendTo() {
        return BrowserInput.send();
    }

}
