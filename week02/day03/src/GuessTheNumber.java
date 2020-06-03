// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
// Generating random number
        Random rand = new Random();
        int computerChoice = rand.nextInt(10);
        //System.out.println(computerChoice);

        // User guessing
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your guess:");
        int userGuess = scanner.nextInt();

        while (computerChoice != userGuess) {
            if (computerChoice > userGuess) {
                System.out.println("The stored number is higher");
            } else if (computerChoice < userGuess) {
                System.out.println("The stored number is lower");
            }
            System.out.println("Your guess:");
            userGuess = scanner.nextInt();
        }
        System.out.println("You found the number: " + computerChoice);
    }
}
