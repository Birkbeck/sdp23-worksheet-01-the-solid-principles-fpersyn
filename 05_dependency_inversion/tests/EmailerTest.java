import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EmailerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Test
    public void testGeneratesAlertString() {
        Emailer emailer = new Emailer();
        System.setOut(new PrintStream(outContent));
        emailer.weatherAlert("sunny");
        assertEquals("It is sunny", outContent.toString());
    }
}
