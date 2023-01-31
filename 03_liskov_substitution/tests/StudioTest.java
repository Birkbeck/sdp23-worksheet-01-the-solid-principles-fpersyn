import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudioTest {
    @Test
    public void testSetSquareFootage() {
        Studio studio = new Studio();
        studio.setSquareFootage(600);
        assertEquals(600, studio.squareFootage);
    }
}
