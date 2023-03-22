package homework17;

public class Vegetable extends Product implements ProductType{

    private ProductState state;

    public Vegetable(String name, double price, ProductState state) {
        super(name, price, state);
        this.state = state;
    }

    public ProductState getState() {
        return state;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    @Override
    public String getDescription() {
        return getName() + " price is " + getPrice() + "." + " Its state is: " + getState() + ".";
    }

    @Override
    public void buyOption() {
        System.out.println("Can be bought " + orderOption);
    }
}
