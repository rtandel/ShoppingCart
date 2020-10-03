package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int ID;
    private String firstName;
    private String lastName;
    private String shippingAddress;
    private Payment paymentInfo;
    private List<Order> orders = new ArrayList<Order>();
    private ShoppingCart shoppingCart;

    public void viewSuggestedProducts() {
        System.out.println("View suggested products");
    }

    public void addToCart(Product product) {
        shoppingCart.add(product);
    }

    public void removeFromCart(Product product) {
        shoppingCart.delete(product);
    }

    public void viewShoppingCart() {
        System.out.println("View Orders");
    }

    public ArrayList<Product> search(String searchWord) {
        ProductList list = new ProductList(searchWord);
        // Display this list.
        ArrayList<Product> productList = list.getList();
        return productList;
    }

    public String placeOrder() {
        shoppingCart.checkout(shippingAddress, paymentInfo);
        return "Success";
    }

}
