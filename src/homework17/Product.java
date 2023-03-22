package homework17;

public abstract class Product {
    private String name;
    private double price;

    private ProductState state;

    public Product(String name, double price, ProductState state) {
        this.name = name;
        this.price = price;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription(){
        return "Fruits state";

    }
}
