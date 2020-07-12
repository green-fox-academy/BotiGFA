public class string {
  //Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
  public static void main(String[] args) {
    System.out.println(removeXRecursive("The x files"));
  }

  public static String removeXRecursive(String input) {
    if (input.isEmpty()) return "";

    char c = input.charAt(0);
    if (c != 'x') {
      return c + removeXRecursive(input.substring(1));
    } else {
      return 'y' + removeXRecursive(input.substring(1));
    }
  }
}
