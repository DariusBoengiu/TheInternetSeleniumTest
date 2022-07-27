package the_internet.key_presses;

import org.example.the_internet.key_presses.Key;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class KeyUnitTest {

    @BeforeAll
    static void goToURL() {
        Key.goTo();
    }

    @Test
    public  void canGoToSpecifiedURL() {
        Assertions.assertTrue(Key.isAt());
    }

    @Test
    public void canSendInput() {
        Assertions.assertEquals("You entered: Q", Key.press());

    }
}
