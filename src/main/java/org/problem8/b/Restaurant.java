package org.problem8.b;

public class Restaurant {
    protected static final double TAX_RATE = 0.10;

    public double calculateTotalBill(double foodPrice) {
        return foodPrice + (foodPrice * TAX_RATE);
    }

    public int estimateDeliveryTime() {
        return 40;
    }
}
