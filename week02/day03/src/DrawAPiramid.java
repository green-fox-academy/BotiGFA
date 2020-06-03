// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
import java.util.Scanner;

public class DrawAPiramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int userInput = scanner.nextInt();

        int odd = 1; // megadtam az induló csillag számot
        int numberrOfSpaces = userInput - 1;
        for (int i = 1; i <= userInput; i++) {
            for (int j = 1; j <= numberrOfSpaces; j++) {
                System.out.print(" "); // ha csak eddig lennénk, akkor 5*(5-1) üres mezőt nyomtatna
            }
            for (int j = 1; j <= odd; j++) {
                System.out.print("*");// ha csak eddig, akkor egymás mellé 4 üres távolsággal 5 csillag nyomtatás
            }
            //System.out.println(); // egymás alá helyezi a csillagokat 4 üres távolsággal
            //odd = odd + 2; // hozzáad 2 csillagot a következő printeléséhez
           //numberrOfSpaces = numberrOfSpaces - 2; // minden egyes új sort balra húz
        }

    }
}
