import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

Scanner scanner = new Scanner (System.in);
        System.out.println("Please type in the number of chickens: ");
        int userInputChickens = scanner.nextInt();
        System.out.println("Please type in the number of pigs: ");
        int userInputPigs = scanner.nextInt();
        int chickenFoot = (int) userInputChickens*2;
        int pigFoot = (int) userInputPigs*4;
        System.out.println("Number of foot in a farm " + (chickenFoot+pigFoot));


    }
}
