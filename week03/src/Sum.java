// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

  public class Sum {
  public static int sum(int n1) {
    int result = 0;
    for (int i = 1; i < n1; i++) {
      result = result + i;

    }
    return result;
  }

    public static void main(String[] args) {
      System.out.println(sum(5));
    }
  }


