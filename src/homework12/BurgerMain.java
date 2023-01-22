package homework12;

public class BurgerMain {
    public static void main(String[] args) {

        Burger vegetarian = new Burger("булка,", "сир,", "салат,", "майонез.", true );


        Burger standard = new Burger("булка,", "м'ясо,", "сир,", "салат,", "майонез.");


        Burger burgerNoMayo = new Burger("булка,", "м'ясо", "сир,", "салат.");




    }
}
