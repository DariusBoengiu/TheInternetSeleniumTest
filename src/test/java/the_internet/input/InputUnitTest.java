package the_internet.input;

import org.example.the_internet.input.Input;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class InputUnitTest {

    @BeforeAll
    static void goToURL() {
        Input.goTo();
    }

    @Test
    public  void canGoToSpecifiedURL() {
        Assertions.assertTrue(Input.isAt());
    }

    @Test
    public void canSendInput() {
        Assertions.assertEquals("1", Input.sendTo());

    }
}
