// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

import java.util.Scanner;

public class PrintADimond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please giv a number:");
        int userInput = scanner.nextInt();

        int noOfColumns = 1;
        int noOfSpaces = userInput / 2;
        for (int i = 1; i <= userInput; i++) {
            for (int j = 1; j <= noOfSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= noOfColumns; j++) {
                System.out.print("*");
            }
            System.out.println();
            //if (i < userInput / 2 + 1) {
            //    noOfColumns = noOfColumns + 2;
            //    noOfSpaces = noOfSpaces - 1;
            //} else {
            //    noOfColumns = noOfColumns - 2;
            //    noOfSpaces = noOfSpaces + 1;
            //}
        }

    }
}
