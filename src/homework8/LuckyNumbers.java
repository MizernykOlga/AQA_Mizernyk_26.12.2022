package homework8;

public class LuckyNumbers {
    public static void main(String[] args) {

        /*
        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей на Марс так,
        щоб у номерах шатлів не траплялося нещасливих чисел. Напишіть функцію, яка виводить усі номери таких шатлів.
         */
        int counter = 0;
        int stop = 100;

        int unluckyNumber1 = 4;
        int unluckyNumber2 = 9;

        for (int i = 1; true; i++) {

            if (i == unluckyNumber1 || i == unluckyNumber2) {
                continue;
            }
            if (i / 10 == unluckyNumber1 || i / 10 == unluckyNumber2 || i % 10 == unluckyNumber1 || i % 10 == unluckyNumber2) {
                continue;
            }
            if (i / 10 % 10 == unluckyNumber1 || i / 10 % 10 == unluckyNumber2 || i % 10 % 10 == unluckyNumber1 || i % 10 % 10 == unluckyNumber2) {
                continue;
            }

            if (counter == stop) {
                break;
            }

            System.out.println(i);
            counter++;
        }
        System.out.println();
        System.out.println("Шатлів: " + counter);
    }
}