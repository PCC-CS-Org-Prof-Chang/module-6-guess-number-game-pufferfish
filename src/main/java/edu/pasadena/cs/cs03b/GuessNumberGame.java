package edu.pasadena.cs.cs03b;
import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter a number of digits: ");
        int digitNum = scanner.nextInt();
        System.out.print("Enter how much money you want to start with: ");
        int moneyAmt = scanner.nextInt();

        String strMsg = GuessNumberGame.dummy(digitNum, moneyAmt);
        System.out.println(strMsg);
    }

    public static String dummy(int digitNum, int moneyAmt) {
        int totalMoney = moneyAmt;

        return "test" + digitNum;
    }
}
