// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the 1st number");
        int userInput1 = scanner.nextInt();
        System.out.println("Please type the 2nd number");
        int userInput2 = scanner.nextInt();
        if (userInput1>userInput2) {
            System.out.println(userInput1);
        }
        else {
            System.out.println(userInput2);
        }

    }
}
