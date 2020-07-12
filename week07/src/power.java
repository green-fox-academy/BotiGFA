public class power {
  //Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
  public static void main(String[] args) {
    System.out.println(power(2,2));

  }
  public static int power (int base, int n) {
    if (base < 1 || n < 1) return 0;
    if (n == 1) return base;
    return base * power (base, n-1);
  }
}
