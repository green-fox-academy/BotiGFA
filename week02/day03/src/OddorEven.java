import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number");
        int userInput = scanner.nextInt();

        if (userInput % 2==0) {
            System.out.println("this number is Even");
        }
        else {
            System.out.println("This number is Odd");
        }
    }
}
