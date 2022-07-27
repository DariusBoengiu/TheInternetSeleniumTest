package the_internet.checkbox;

import org.example.the_internet.checkbox.Checkbox;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CheckboxUnitTest {

    @BeforeAll
    static void goToURL() {
        Checkbox.goTo();
    }

    @Test
    public  void canGoToSpecifiedURL() {
        Assertions.assertTrue(Checkbox.isAt());
    }

    @Test
    public void canCheckBoxes() {
        Assertions.assertTrue(Checkbox.check());
    }
}
