package Homework4;

public class Main {
    public static void main(String[] args) {
        int length = 6;
        int width = 9;
        int height = 13;

        int volume = length * width * height;
        System.out.println("Об'єм паралелепіпеда " + volume);

        int edge = 4;
        int lengthAllEdges = edge * (length + width + height);
        System.out.println("Сумарна довжина всіх сторін " + lengthAllEdges);
    }
}
