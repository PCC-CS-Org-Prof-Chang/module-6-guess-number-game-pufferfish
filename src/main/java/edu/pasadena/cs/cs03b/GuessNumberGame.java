package edu.pasadena.cs.cs03b;
import java.util.Random;
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
        Scanner scanner = new Scanner (System.in);
        
        int totalMoney = moneyAmt;

        int lowerBound = (int) Math.pow(10, digitNum - 1);
        int randomNum = lowerBound + new Random().nextInt(9 * lowerBound);

        String anotherGuess = "";

        do {


            System.out.print("Enter a guess: ");
            
            int guessNum = scanner.nextInt();
            if (guessNum == randomNum) {
                totalMoney = 0;
                return "You Win!";
            }
            else if (guessNum > randomNum) {
                System.out.println("Your guess is too high.");
                System.out.print("Would you like to buy another guess? (y/n): ");
                anotherGuess = scanner.next();
                if (anotherGuess.equals("y")) {
                    totalMoney -= 1;
                    System.out.println("You have $" + totalMoney + " left.");
                }
                else {
                    return "You Lose!";
                }
            }
            else {
                System.out.println("Your guess is too low.");
                System.out.print("Would you like to buy another guess? (y/n): ");
                anotherGuess = scanner.next();
                if (anotherGuess.equals("y")) {
                    totalMoney -= 1;
                    System.out.println("You have $" + totalMoney + " left.");
                }
                else {
                    return "You Lose!";
                }
            }

        }
        while (totalMoney > 0);

        return "You Lose!";
    }
}
