// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please type in the 1st number");
        int userInput1 = scanner.nextInt();

        System.out.println("Please type in the 2nd number");
        int userInput2 = scanner.nextInt();

        System.out.println("Please type in the 3rd number");
        int userInput3 = scanner.nextInt();

        System.out.println("Please type in the 4th number");
        int userInput4 = scanner.nextInt();

        System.out.println("Please type in the 5th number");
        int userInput5 = scanner.nextInt();


        int sumOfNumers = (int) (userInput1+userInput2+userInput3+userInput4+userInput5);
        float averageNumber = sumOfNumers/5f;

        System.out.println("Sum: " + sumOfNumers + ", "+ "Average: " + averageNumber);




    }
}
