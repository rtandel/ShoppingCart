package shoppingCart;
// An online shopping system that accepts user orders and adds
// to a shopping cart. Singleton pattern is used here to manage
// user sessions.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserManager {
    private String name;
    private int numUsers;

    private final List<User> users = new ArrayList<User>();
    private HashMap<Integer, Order> activeOrders;

    private static UserManager userManager = null;

    private UserManager() {
    }

    // Singleton is used here to ensure that only one object
    // of UserManager exists in the system
    public static UserManager getInstance() {
        if (userManager == null) {
            userManager = new UserManager();
        }
        return userManager;
    }

    // this method is 'synchronized' to allow multiple order sessions
    // without interfering with each other
    public synchronized Order getNewOrder() {
        Order order = new Order();
        this.activeOrders.put(order.getID(), order);
        return order;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void deleteUser(User user) {
        users.remove(user);
    }
}