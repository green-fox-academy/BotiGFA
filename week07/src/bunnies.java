public class bunnies {
  //We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
  public static void main(String[] args) {
    System.out.println(countOfEars(4));
  }
  /* public static int countOfEars(int n){
    if (n==0) return 0;
    return n * 2 ;
  }
}
*/

  public static int countOfEars(int n) {
    if (n < 1) return 0;

    return 2 + countOfEars(n - 1);
  }
}

