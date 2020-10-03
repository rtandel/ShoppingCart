package shoppingCart;

import java.util.HashMap;

public class Category {
    private String category;
    private HashMap<Integer,String> categoryMap; // this would be some sort of set list of categories.

    public Category(int itemID) {
        setCategory(itemID);
    }

    public void setCategory(int itemID) {
        category = categoryMap.get(itemID);

    }

    public String getCategory() {
        return this.category;
    }
}