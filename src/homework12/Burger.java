package homework12;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String salad;
    String mayonnaise;

    boolean noMeat = true;

    public Burger(String bun, String cheese, String salad, String mayonnaise, boolean noMeat) {
        this.bun = bun;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        this.noMeat = noMeat;
        System.out.println("Веггі бургер: " + " " + bun + " " + cheese + " " + salad + " " + mayonnaise);

    }

    public Burger(String bun, String meat, String cheese, String salad, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        //System.out.println("Стандарт: " + " " + bun + " " + meat + " " + salad + " " +  mayonnaise);
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Стандарт: " + bun + " " + meat + " " + cheese + " " + salad + " " + mayonnaise;
    }

    public Burger(String bun, String meat, String cheese, String salad) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        printNoMayo();

    }
    void printNoMayo(){
        System.out.println("Бургер без майо: " + " " + bun + " " + meat + " " + cheese + " " + salad);
    }



}

