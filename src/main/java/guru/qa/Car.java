package guru.qa;

import java.util.LinkedList;

public class Car {

    private String brand;
    private String model;
    private int year_of_release;
    private int price;
    private boolean isRacing;
    private Car[] otherCityCars;
    private LinkedList<Car> carList;

    public Car(String brand, String model, int year_of_release,
               int price, boolean isRacing) {
        this.brand = brand;
        this.model = model;
        this.year_of_release = year_of_release;
        this.price = price;
        this.isRacing = isRacing;

    }

    public void addCar(Car[] otherCityCars) {
        this.otherCityCars = otherCityCars;
    }

    public void printOtherCityCars() {
        for (int i = 0; i < otherCityCars.length; i++) {
            System.out.println(otherCityCars[i]);
        }
    }

    public void printCarByBrandIfPresent(String brand) {
        for (int i = 0; i < otherCityCars.length; i++) {
            Car otherCityCar = otherCityCars[i];
            if (otherCityCar.brand.equals(brand)) {
                System.out.println(otherCityCar);
                return;
            }
        }
        System.out.println("Not found");
    }

    public Car() {
        this.carList = new LinkedList<Car>();
    }

    public void addCarToQueue(Car value) {
        this.carList.add(value);
    }

    public void removeCar(Car value) {
        this.carList.remove(value);
    }

    public void findCar(Car value) {
        boolean found = false;
        while (!found && !this.carList.isEmpty()) {
            if (this.carList.peek().equals(value)) {
                System.out.println("Search for Car in the collection:" + " " + value + " " +  "Found");
                found = true;
            } else {
                this.carList.pop();
            }
        }
        if (!found) {
            System.out.println("Search for Car in the collection:" + " " + value + " " +  "Not found");
        }
    }


    public void printCars() {
        for (Car i : this.carList) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return brand + " " + model + "," + " " + "year of release:" + " " + year_of_release
                + "," + " " + "price:" + " " + price + " " + "RUB" + "," + " " + isRacing + ".";
    }
}
