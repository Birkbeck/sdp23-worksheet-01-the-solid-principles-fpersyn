import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WeatherTrackerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testReturnsCurrentWeather() {
        Phone phone = new Phone();
        WeatherTracker tracker = new WeatherTracker(phone);
        tracker.setCurrentConditions("rainy");

        assertEquals("rainy", tracker.currentConditions);
    }

    @Test
    public void testAlertsPhoneUsersWhenRaining() {
        Phone phone = new Phone();
        WeatherTracker tracker = new WeatherTracker(phone);
        System.setOut(new PrintStream(outContent));
        tracker.setCurrentConditions("rainy");

        assertEquals("It is rainy", outContent.toString());
    }

    @Test
    public void testAlertsViaEmailWhenSunny() {
        Emailer emailer = new Emailer();
        WeatherTracker tracker = new WeatherTracker(emailer);
        System.setOut(new PrintStream(outContent));
        tracker.setCurrentConditions("sunny");

        assertEquals("It is sunny", outContent.toString());
    }
}
