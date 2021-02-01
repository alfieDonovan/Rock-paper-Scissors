package rockpaperscissors;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String Scissors = new String("Scissors");
        String Rock = new String("Rock");
        String Paper = new String("Paper");

        int scoreUser = 0;
        int scoreComputer = 0;

        boolean game = true;

        while (game == true) {
            
            System.out.println();
            System.out.println("enter \"Rock\", \"Paper\" or \"Scissors\"");
            String answer = input.next();
            System.out.println();
            int number = random.nextInt(3);

            if (number == 0) {
                String answer2 = Rock;
                if (answer.equals(Paper)) {
                    System.out.println("you have " + answer);
                    System.out.println("opponent has " + answer2);
                    System.out.println("you win!");
                    scoreUser = scoreUser + 1;
                } else if (answer.equals(Scissors)) {
                    System.out.println("you have " + answer);
                    System.out.println("opponent has " + answer2);
                    System.out.println("you lose");
                    scoreComputer = scoreComputer + 1;
                } else if (answer.equals(Rock)) {
                    System.out.println("you have " + answer);
                    System.out.println("opponent has " + answer2);
                    System.out.println("draw");
                } else {
                    System.out.println("Enter a valid choice");
                }

            } else if (number == 1) {
                String answer2 = Paper;
                if (answer.equals(Rock)) {
                    System.out.println("you have " + answer);
                    System.out.println("opponent has " + answer2);
                    System.out.println("you lose");
                    scoreComputer = scoreComputer + 1;
                } else if (answer.equals(Paper)) {
                    System.out.println("you have " + answer);
                    System.out.println("opponent has " + answer2);
                    System.out.println("draw");
                } else if (answer.equals(Scissors)) {
                    System.out.println("you have " + answer);
                    System.out.println("opponent has " + answer2);
                    System.out.println("you win!");
                    scoreUser = scoreUser + 1;
                } else {
                    System.out.println("Enter a valid choice");
                }

            } else if (number == 2) {
                String answer2 = Scissors;
                if (answer.equals(Rock)) {
                    System.out.println("you have " + answer);
                    System.out.println("opponent has " + answer2);
                    System.out.println("you win!");
                    scoreUser = scoreUser + 1;
                } else if (answer.equals(Paper)) {
                    System.out.println("you have " + answer);
                    System.out.println("opponent has " + answer2);
                    System.out.println("you lose");
                    scoreComputer = scoreComputer + 1;
                } else if (answer.equals(Scissors)) {
                    System.out.println("you have " + answer);
                    System.out.println("opponent has " + answer2);
                    System.out.println("draw");
                } else {
                    System.out.println("Enter a valid choice");
                }

            }
            System.out.println();
            System.out.println("your score is " + scoreUser);
            System.out.println("your opponents score is " + scoreComputer);
            System.out.println("do you want to continue playing? if not enter \"No\"");
            String a = input.next();
            if (a.equals("No")) {
                game = false;
            }
        }
    }

}
