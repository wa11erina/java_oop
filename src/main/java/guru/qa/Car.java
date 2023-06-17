package guru.qa;

public class Car {

    private String brand;
    private String model;
    private int year_of_release;
    private int price;
    private boolean isRacing;

    public Car(String brand, String model, int year_of_release,
               int price, boolean isRacing) {
        this.brand = brand;
        this.model = model;
        this.year_of_release = year_of_release;
        this.price = price;
        this.isRacing = isRacing;

    }

    @Override
    public String toString() {
        return brand + " " + model + "," + " " + "year of release:" + " " + year_of_release
                + "," + " " + "price:" + " " + price + " " + "RUB" + "," + " " + isRacing;
    }
}
