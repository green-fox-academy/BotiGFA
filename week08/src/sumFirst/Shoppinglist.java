package sumFirst;

import java.util.ArrayList;
import java.util.Arrays;

public class Shoppinglist {
  public static void main(String[] args) {
    // We are going to represent a shopping list in a list containing strings.
    // Create a list with the following items.
    // Eggs, milk, fish, apples, bread and chicken
    ArrayList<String> shoppingList = new ArrayList<>();
    shoppingList.addAll(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

    // Create an application which solves the following problems.
    // Do we have milk on the list?
    if (shoppingList.contains("milk") == true) {
      System.out.println("Yes, we have milk on the list.");
    } else {
      System.out.println("No, we don't have milk on the list, yet.");
    }
    String example = "In a dishwasher far far away";

    String modifiedString = example.replace("dishwasher", "galaxy");
  }
}