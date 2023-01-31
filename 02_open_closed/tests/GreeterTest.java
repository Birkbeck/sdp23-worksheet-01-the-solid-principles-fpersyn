import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {
    @Test
    public void testSaysHello() {
        Greeter greeter = new DefaultGreeter();
        assertEquals("Hello.", greeter.greet());
    }

    @Test
    public void testSaysHelloFormally() {
        Greeter greeter = new FormalGreeter();
        assertEquals("Good evening", greeter.greet());
    }

    @Test
    public void testSaysHelloCasually() {
        Greeter greeter = new CasualGreeter();
        assertEquals("Goodday?", greeter.greet());
    }

    @Test
    public void testSaysHelloIntimately() {
        Greeter greeter = new IntimateGreeter();
        assertEquals("Hello darling!", greeter.greet());
    }
}
