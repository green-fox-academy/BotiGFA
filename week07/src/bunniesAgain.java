public class bunniesAgain {
  // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
  // The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
  // Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
  public static void main(String[] args) {
    System.out.println(countOfEars2(4));
  }


  public static int countOfEars2(int n) {
    if (n < 1) return 0;
    if (n % 2 == 1) return 2 + countOfEars2(n - 1);
    return 3 + countOfEars2(n - 1);
  }
}

