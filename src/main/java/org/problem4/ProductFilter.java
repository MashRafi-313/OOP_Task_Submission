package org.problem4;

public class ProductFilter {

    // Filter by category
    public void filterProducts(String category) {
        System.out.println("Filtering products by category: " + category);
    }

    // Filter by price range
    public void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Filtering products by price range: $" + minPrice + " - $" + maxPrice);
    }

    // Filter by brand
    public void filterProductsByBrand(String brand) {
        System.out.println("Filtering products by brand: " + brand);
    }

    // Filter by category and price range
    public void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Filtering products in category '" + category +
                "' with price between $" + minPrice + " and $" + maxPrice);
    }

    // Filter by category, price range, and brand
    public void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Filtering products in category '" + category +
                "', price between $" + minPrice + " and $" + maxPrice +
                ", brand: " + brand);
    }


    public static void main(String[] args) {
        ProductFilter pf = new ProductFilter();

        pf.filterProducts("electronics");
        pf.filterProducts(100, 500);
        pf.filterProductsByBrand("Apple");
        pf.filterProducts("fashion", 50, 300);
        pf.filterProducts("electronics", 100, 500, "Samsung");
    }
}

