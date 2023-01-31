import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitUpgraderTest {
    @Test
    public void testUpgraderIncreasesSquareFootageOfPenthouse() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1500);
        UnitUpgrader upgrader = new UnitUpgrader();
        upgrader.upgradeSquareFootage(penthouse);

        assertEquals(1540, penthouse.squareFootage);
    }

    @Test
    public void testUpgraderAddsBedroomToApartment() {
        PenthouseSuite penthouse = new PenthouseSuite();
        UnitUpgrader upgrader = new UnitUpgrader();
        upgrader.upgradeBedrooms(penthouse);

        assertEquals(5, penthouse.numberOfBedrooms);
    }

    @Test
    public void testUpgraderIncreasesSquareFootageOfStudio() {
        Studio studio = new Studio();
        studio.setSquareFootage(550);
        UnitUpgrader upgrader = new UnitUpgrader();
        upgrader.upgradeSquareFootage(studio);

        assertEquals(590, studio.squareFootage);
    }
}
