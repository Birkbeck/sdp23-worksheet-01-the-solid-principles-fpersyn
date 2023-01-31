abstract sealed class Apartment permits ApartmentWithBedrooms, Studio {
    int squareFootage;

    abstract void setSquareFootage(int sqft);
}
