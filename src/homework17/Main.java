package homework17;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 50.90,  ProductState.FRESH);
        System.out.println(apple.getDescription());
        apple.buyOption();
        System.out.println();
        Vegetable cucumber = new Vegetable("Cucumber", 1.2, ProductState.UNDERRIPE);
        System.out.println(cucumber.getDescription());
        cucumber.buyOption();

        //task to use interface

    }
}
