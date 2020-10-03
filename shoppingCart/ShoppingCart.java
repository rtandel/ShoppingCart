package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<Product>();
    private int totalCost;
    private int numProduct;

    public void clear() {
        products.clear();
    }

    public void delete(Product product) {
        products.remove(product);
    }

    public void add(Product product) {
        products.add(product);
    }

    public void checkout(String shippingAddress, Payment payment) {
        System.out.println("Use shippingAddress and paymentInfo to place the order. Would give an estimated arrival time");
    }

    public void displayRecommendedProducts() {
        //Based on first item
        System.out.println("Use the first item's category to generate a suggested products list.");
    }

}