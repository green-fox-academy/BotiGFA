import java.util.Scanner;

public class DrawACheesTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i % 2 == 1 && j % 2 ==1 || i % 2 == 0 && j % 2 == 0) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
