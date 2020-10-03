package shoppingCart;

public class Product {
    private int ID;
    private String name;
    private double price;
    private String category;

    public Product(String name) {
        this.name = name;
    }

    public void setItemCategory() {
        Category itemCategory = new Category(this.ID);
        this.category = itemCategory.getCategory();
    }

    public String getItemCategory() {
        return this.category;
    }

}
