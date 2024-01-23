package edu.pasadena.cs.cs03b;
import java.util.Scanner;
import java.lang.Math;



public class GuessNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter a number of digits: ");
        int digitNum = scanner.nextInt();
        System.out.print("Enter how much money you want to start with: ");
        int totalMoney = scanner.nextInt();

        int randomNum = (int)(Math.random() * Math.pow(10, digitNum - 1));
        String anotherGuess = "";
        System.out.println(randomNum);
        System.out.println(totalMoney);

        do {

            System.out.print("Enter a guess: ");
            int guessNum = scanner.nextInt();
            System.out.println(totalMoney);
            if (guessNum == randomNum) {
                totalMoney = 0;
                System.out.println("You Win!");
                break;
            }
            else if (guessNum > randomNum) {
                System.out.println("Your guess is too high.");
                System.out.print("Would you like to buy another guess? (Y/N)");
                if (scanner.nextLine() == "Y") {
                    totalMoney -= 1;
                }
                else {
                    break;
                }
            }
            else {
                System.out.println("Your guess is too low.");
                System.out.print("Would you like to buy another guess? (Y/N)");
                if (scanner.nextLine() == "Y") {
                    totalMoney -= 1;

                }
                else {
                    break;
                }
            }

        }
        while (totalMoney > 0);



        return "test" + digitNum;
    }

    }
        
