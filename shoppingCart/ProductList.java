package shoppingCart;

import java.util.ArrayList;

public class ProductList {

    ArrayList<Product> list;

    public ProductList(String searchWord) {
        list = new ArrayList();
        setList(searchWord);
    }

    public void setList(String searchWord) {
        for (int i = 0; i < 20; i++) {
            // Generate the list using the category of the searched word as well as the product name.
            Product product = new Product("Food");
            list.add(product);
        }
    }

    public ArrayList<Product> getList() {
        return list;
    }

}