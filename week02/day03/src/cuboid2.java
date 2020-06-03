public class cuboid2 {
    public static void main(String[] args) {
        double a = 10;
        double b = 10;
        double c = 10;

        double surfaceArea = (a * a + b * b + c * c) * 2;
        double volume = a * b * c;

        int surfaceArea2 = (int) surfaceArea;
        int volume2 = (int) volume;

        System.out.println("Surface Area: " + surfaceArea2);
        System.out.println("Volume: " + volume2);
    }
}
