package homework15;

public class Cat {

    public String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {
    }

    public void sayMeow() {
        System.out.println("Meow");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Enter positive number");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            System.out.println("Enter positive number");
    }
    }


    public static void main(String[] args) {

        Cat cat = new Cat("Lisa", 3, 3);
        cat.setWeight(-1);

        System.out.println("weight is: " + cat.getWeight());

        cat.setAge(-1111);
        System.out.println("age is: " + cat.getAge());


    }

}