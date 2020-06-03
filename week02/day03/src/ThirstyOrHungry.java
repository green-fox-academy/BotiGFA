public class ThirstyOrHungry {
    public static void main(String[] args) {
        boolean thirsty = true;
        boolean hungry = false;


        if (thirsty && hungry) {
            System.out.println("Lunch time!");
        } else if (thirsty || hungry) {
            System.out.println("Snack time!");
        } else {
            System.out.println("No food for you, little fatty.");
        }
    }
}
