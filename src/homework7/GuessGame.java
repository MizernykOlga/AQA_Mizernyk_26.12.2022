package homework7;

import java.util.Scanner;
/*відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10.
Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).
*/
public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 11);
        int userGuess = 0;
        System.out.println(randomNumber);

        for (int i = 0; i < 3; i++) {

            System.out.println("Guess a number between 0 and 10 range: ");
            if (userGuess == randomNumber){
                System.out.println("That's correct! Computer picked number: " + randomNumber);
            } else {
                System.out.println("Try another round. Computer picked number: " + randomNumber);

            /*while (true) {
                if (scanner.hasNextInt()) {
                    userGuess = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Woops, not a number.");
                    scanner.nextLine();
                    break;
                }
            }*/
        }

        }

        scanner.close();
    }
}
























/*public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 11);
        int userGuess = 0;
        int tries = 3;
        System.out.println(randomNumber);

        for (int i = 0; i <= tries; i++) {
                System.out.println("Guess a number between 0 and 10 range: ");
                if (scanner.hasNextInt()) {
                    userGuess = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    System.out.println("Woops, not a number.");
                    scanner.nextLine();
                    //continue;
            }
        }
        if (userGuess == randomNumber){
            System.out.println("That's correct! Computer picked number: " + randomNumber);
        } else {
            System.out.println("Try another round. Computer picked number: " + randomNumber);
        }

        scanner.close();
    }
}*/

