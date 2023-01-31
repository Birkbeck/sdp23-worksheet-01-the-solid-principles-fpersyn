import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PhoneTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Test
    public void testGeneratesAlertString() {
        Phone phone = new Phone();
        System.setOut(new PrintStream(outContent));
        phone.weatherAlert("rainy");
        assertEquals("It is rainy", outContent.toString());
    }
}
