package org.example.pluralsight;

public class Pages {

    public static HomePage homePage() {
        HomePage homePage = new HomePage();

        return homePage;
    }

    public static AuthorPages authorPages() {
        AuthorPages authorPages = new AuthorPages();
        return authorPages;
    }
}
