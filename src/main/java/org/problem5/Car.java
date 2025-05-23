package org.problem5;

public class Car {

    private String owner;
    private String brandName;
    private String serialNumber;
    private double fuelLevel;

    public Car(String owner, String brandName, String serialNumber, double fuelLevel) {
        this.owner = owner;
        this.brandName = brandName;
        this.serialNumber = serialNumber;
        this.fuelLevel = fuelLevel;
    }

    // Method to start the car
    public void start() {
        if (fuelLevel > 0) {
            System.out.println("Car started.");
        } else {
            System.out.println("Cannot start the car. Fuel tank is empty.");
        }
    }

    // Method to stop the car
    public void stop() {
        System.out.println("Car stopped.");
    }

    // Method to check fuel level
    public void checkFuel() {
        System.out.println("Current fuel level: " + fuelLevel + " liters.");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }


    public static void main(String[] args) {
        Car myCar = new Car("Alice", "Toyota", "SN12345", 10.5);

        myCar.checkFuel();   // Output: Current fuel level: 10.5 liters.
        myCar.start();       // Output: Car started.
        myCar.stop();        // Output: Car stopped.

        myCar.setFuelLevel(0);
        myCar.start();       // Output: Cannot start the car. Fuel tank is empty.
    }
}

