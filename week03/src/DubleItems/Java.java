// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array
import java.util.Arrays;

public class Java {
  public static void main(String[] args) {
    int [] numlist = {3, 4, 5, 6, 7};
    for (int i = 0; i < numlist.length; i++) {
      numlist[i]=numlist[i]*2;
      System.out.print(numlist[i]+ ", ");
    }
    System.out.println();
  }
}
