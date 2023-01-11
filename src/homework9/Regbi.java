package homework9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Regbi {
    public static void main(String[] args) {

        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int)(Math.random() * 23 + 18);
            sum1 += team1[i];
        }
        System.out.println();
        System.out.println(team1.length + " players," + " age from 18 to 40: " + Arrays.toString(team1));
        double avg1 = sum1 / team1.length;
        System.out.println("Average age: " + avg1);

        // second team
        System.out.println();
        for (int j = 0; j < team2.length; j++) {
            team2[j] = (int)(Math.random() * 23 + 18);
            sum2 += team2[j];
            }

        System.out.println(team2.length + " players," + " age from 18 to 40: " + Arrays.toString(team2));
        double avg2 = sum2 / team2.length;
        System.out.println("Average age: " + avg2);
        }




    }

