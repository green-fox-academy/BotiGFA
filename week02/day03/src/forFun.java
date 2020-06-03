import java.util.Scanner;

public class forFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is my Name: Boti");
        int userInput = scanner.nextInt();
        for (int i = 1; i <= userInput*2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("Vendi");
    }

}
