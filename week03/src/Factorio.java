//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

  public class Factorio {
    public static int factorio (int num){
      int result = 1;
      for (int i = 1; i < num; i++) {
        result = result * i;
      }
      return result;
    }

    public static void main(String[] args) {
      System.out.println(factorio(6));
    }
}
