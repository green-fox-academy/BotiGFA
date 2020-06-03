public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
        double cuboidSides = 10;
        double surfaeceArea = (cuboidSides * cuboidSides * 6);
        double volume = (cuboidSides * cuboidSides * cuboidSides);
        int surfaceArea2 = (int) surfaeceArea;
        int volume2 = (int) volume;
        System.out.println("Surface Area: " + surfaceArea2);
        System.out.println("Volume: " + volume2);

    }
}

