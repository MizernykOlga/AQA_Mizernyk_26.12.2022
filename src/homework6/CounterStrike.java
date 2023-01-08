package homework6;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        String teamName1;
        String teamName2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1st team: ");
        teamName1 = scanner.nextLine();

        int firstTeamPlayer1 = 0;
        while(true) {
            System.out.println("Enter player1 score: ");
            if (scanner.hasNextInt()) {
                firstTeamPlayer1 = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Oops, not a number. Try again!");
                scanner.nextLine();
            }
        }

        int firstTeamPlayer2 = 0;
        while(true) {
            System.out.println("Enter player2 score: ");
            if (scanner.hasNextInt()) {
                firstTeamPlayer2 = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Oops, not a number. Try again!");
                scanner.nextLine();
            }
        }

        int firstTeamPlayer3 = 0;
        while (true) {
            System.out.println("Enter player3 score: ");
            if (scanner.hasNextInt()) {
                firstTeamPlayer3 = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Oops, not a number. Try again!");
                scanner.nextLine();
            }
        }

        int firstTeamPlayer4 = 0;
        while (true) {
            System.out.println("Enter player4 score: ");
            if (scanner.hasNextInt()) {
                firstTeamPlayer4 = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Oops, not a number. Try again!");
                scanner.nextLine();
            }
        }

        int firstTeamPlayer5 = 0;
        while (true) {
            System.out.println("Enter player5 score: ");
            if (scanner.hasNextInt()) {
                firstTeamPlayer5 = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Oops, not a number. Try again!");
                scanner.nextLine();
            }
        }

        //Second team, each score stored in a var, verification on entering int data type

        System.out.println("2nd team: ");
        teamName2 = scanner.nextLine();

        int secondTeamPlayer1 = 0;
        while (true) {
            System.out.println("Enter player1 score: ");
            if (scanner.hasNextInt()) {
                secondTeamPlayer1 = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Oops, not a number. Try again!");
                scanner.nextLine();
            }
        }

        int secondTeamPlayer2 = 0;
        while (true) {
            System.out.println("Enter player2 score: ");
            if (scanner.hasNextInt()) {
                secondTeamPlayer2 = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Oops, not a number. Try again!");
                scanner.nextLine();
            }
        }

        int secondTeamPlayer3 = 0;
        while (true) {
            System.out.println("Enter player3 score: ");
            if (scanner.hasNextInt()) {
                secondTeamPlayer3 = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Oops, not a number. Try again!");
                scanner.nextLine();
            }
        }

        int secondTeamPlayer4 = 0;
        while (true) {
            System.out.println("Enter player4 score: ");
            if (scanner.hasNextInt()) {
                secondTeamPlayer4 = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Oops, not a number. Try again!");
                scanner.nextLine();
            }
        }

        int secondTeamPlayer5 = 0;
        while (true) {
            System.out.println("Enter player5 score: ");
            if (scanner.hasNextInt()) {
                secondTeamPlayer5 = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Oops, not a number. Try again!");
                scanner.nextLine();
            }
        }
        //closure, to avoid memory leak
        scanner.close();

        //teams average
        System.out.println();
        double averageTeam1 = (double)(firstTeamPlayer1 + firstTeamPlayer2 + firstTeamPlayer3 + firstTeamPlayer4 + firstTeamPlayer5) / 5;
        System.out.println("First team average score is " + averageTeam1);

        double averageTeam2 = (double)(secondTeamPlayer1 + secondTeamPlayer2 + secondTeamPlayer3 + secondTeamPlayer4 + secondTeamPlayer5) / 5;
        System.out.println("Second team average score is " + averageTeam2);
        System.out.println();

        //score comparison & the winner
        if (averageTeam1 > averageTeam2) {
            System.out.println("The WINNER is " + teamName1 + " with " + averageTeam1 + " scores");
        } else if (averageTeam2 > averageTeam1) {
            System.out.println("The WINNER is " + teamName2 + " with " + averageTeam2 + " scores");
        } else if (averageTeam1 == averageTeam2) {
            System.out.println("Good job! CONGRATULATION to both teams!");
        }

    }
}
