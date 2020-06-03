import java.util.Scanner;
public class MileToKmConvertes {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me the distance in miles");
        double userInput = scanner.nextInt();
        double output = userInput/1.609344;

        System.out.println("This is " + output + " Km");



    }
}

