// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was
import java.util.Scanner;

public class DrawASquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plesase giv a number:");
        int userInput = scanner.nextInt();
        for (int i = 0; i <= userInput; i++) {
            for (int j = 0; j <= userInput; j++) {
                if (i == 0 || j == 0 || i == userInput || j == userInput) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
