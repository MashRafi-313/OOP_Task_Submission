package org.problem8.b;

public class FastFoodRestaurant extends Restaurant {
    private static final double FAST_FOOD_TAX_RATE = 0.15;

    @Override
    public double calculateTotalBill(double foodPrice) {
        return foodPrice + (foodPrice * FAST_FOOD_TAX_RATE);
    }

    @Override
    public int estimateDeliveryTime() {
        return 20; // Faster delivery
    }
}
