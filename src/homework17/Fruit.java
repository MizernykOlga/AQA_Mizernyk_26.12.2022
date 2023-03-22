package homework17;

public class Fruit extends Product implements ProductType{

    private ProductState state;

    public Fruit(String name, double price, ProductState state) {
        super(name, price, state);
        this.state = state;
    }


    @Override
    public String getDescription() {
        return getName() + " price is " + getPrice() + "." + " Its state is: " + getState() + ".";
    }

    public ProductState getState() {
        return state;
    }

    @Override
    public void buyOption() {
        System.out.println("Can be bought " + orderOption);
    }

}
