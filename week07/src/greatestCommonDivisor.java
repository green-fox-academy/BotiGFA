public class greatestCommonDivisor {
  public static void main(String[] args) {
    // Find the greatest common divisor of two numbers using recursion.
    System.out.println(findGreatestCommonDivisor(81, 72));
  }

  public static int findGreatestCommonDivisor(int a, int b) {
    if (b == 0) return a;
    return findGreatestCommonDivisor(b, a % b);
  }
}