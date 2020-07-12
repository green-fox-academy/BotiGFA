import java.util.ArrayList;
import java.util.Arrays;

public class matyiMain {

  public static void main(String[] args) {
    System.out.println(factorial(10));
    System.out.println(factorialRecursive(10));

    ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
    System.out.println(addElements(array));
    System.out.println(addElementsRecursive(array));

    System.out.println(removeX("asdasdasdxxxxxxasdasdasd"));
    System.out.println(removeXRecursive("asdasdasdxxxxxxasdasdasd"));
  }

  public static int factorial(int n) {
    int result = 1;
    for (int i = n; i > 0; i--) {
      result = result * i;
    }
    return result;
  }

  public static int factorialRecursive(int n) {
    if (n < 0) return 0;
    if (n == 0) return 1;

    System.out.println("Hello from f(" + n + ")");

    int result = n * factorialRecursive(n - 1);

    System.out.println("Hello again from f(" + n + ")");

    return result;
  }

  public static int addElements(ArrayList<Integer> array) {
    int result = 0;
    for (int n : array) {
      result += n;
    }
    return result;
  }

  public static int addElementsRecursive(ArrayList<Integer> array) {
    System.out.println(array.toString());

    if (array.isEmpty())
      return 0;

    return array.get(0) + addElementsRecursive(new ArrayList(array.subList(1, array.size())));
  }

  // Strings again
  // Given a string, compute recursively a new string where all the 'x' chars have been removed.
  public static String removeX(String input) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c != 'x') {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  public static String removeXRecursive(String input) {
    if (input.isEmpty()) return "";

    char c = input.charAt(0);
    if (c != 'x') {
      return c + removeXRecursive(input.substring(1));
    } else {
      return removeXRecursive(input.substring(1));
    }
  }
}