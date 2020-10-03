package shoppingCart;

public class User {
    private int ID;
    private String firstName;
    private String lastName;
    private String shippingAddress;
    private Payment paymentInfo;
    private List<Order> orders = new ArrayList<>();
    private ShoppingCart shoppingCart;

    public void viewSuggestedProducts() {
        System.out.println("View suggested products");
    }

    public void addToCart(Product product) {
        shoppingCart.add(product)
    }

    public void removeFromCart(Product product) {
        shoppingCart.remove
    }

    public void viewShoppingCart() {
        System.out.println("View Orders");
    }

    public ArrayList<Product> search(String searchWord) {
        ProductList list = new ProductList();
        // Display this list.
        ArrayList<Product> productList = list.getList();
    }

    public String placeOrder() {
        shoppingCart.checkout(shippingAddress, paymentInfo);
    }

}
