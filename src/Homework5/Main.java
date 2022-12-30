package Homework5;

public class Main {
    public static void main(String[] args) {

        int li = 860;

        int warriorLiTroops = 13 * li;
        int archerLiTroops = 23 * li;
        int riderLiTroops = 46 * li;
        int liTroops = warriorLiTroops + archerLiTroops + riderLiTroops;

        double mi = 1.5 * 860;

        int warriorMiTroops = (int) (9 * mi);
        int archerMiTroops = (int) (35 * mi);
        int riderMiTroops = (int) (12 * mi);
        int miTroops = warriorMiTroops + archerMiTroops + riderMiTroops;

        System.out.println();
        System.out.println("Загальна атака династії Лі " + liTroops);
        System.out.println("Загальна атака династії Mінь " + miTroops);

    }
}
