public class UnitUpgrader {
    public void upgradeSquareFootage(Apartment apartment) {
        apartment.squareFootage += 40;
    }
    public void upgradeBedrooms(ApartmentWithBedrooms apartment) {
        apartment.numberOfBedrooms += 1;
    }
}
