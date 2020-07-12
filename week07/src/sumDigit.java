public class sumDigit {
  //Given a non-negative integer n, return the sum of its digits recursively (without loops).
  //Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
  //Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).
  public static void main(String[] args) {
    System.out.println(sumDigit(1512));
  }
  public static int sumDigit (int n){
    if (n==0) return 0;
    int rightMost = n % 10;
    int removeRightMost = n / 10;
    return rightMost + sumDigit(removeRightMost);
  }
}
