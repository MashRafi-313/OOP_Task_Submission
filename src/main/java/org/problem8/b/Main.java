package org.problem8.b;

public class Main {
    public static void main(String[] args) {
        double foodPrice = 100.0;

        Restaurant genericRestaurant = new Restaurant();
        Restaurant fastFood = new FastFoodRestaurant();
        Restaurant fineDining = new FineDiningRestaurant();

        System.out.println("Generic Restaurant:");
        System.out.println("Total Bill: $" + genericRestaurant.calculateTotalBill(foodPrice));
        System.out.println("Delivery Time: " + genericRestaurant.estimateDeliveryTime() + " mins\n");

        System.out.println("Fast Food Restaurant:");
        System.out.println("Total Bill: $" + fastFood.calculateTotalBill(foodPrice));
        System.out.println("Delivery Time: " + fastFood.estimateDeliveryTime() + " mins\n");

        System.out.println("Fine Dining Restaurant:");
        System.out.println("Total Bill: $" + fineDining.calculateTotalBill(foodPrice));
        System.out.println("Delivery Time: " + fineDining.estimateDeliveryTime() + " mins");
    }
}
