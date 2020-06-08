// - Create an array variable named `firstArrayOfNumbers`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `secondArrayOfNumbers`
//   with the following content: `[4, 5]`
// - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
//   elements than `firstArrayOfNumbers`
  public class CompareLength {
    public static void main(String[] args) {
       int [] firstArrayOfNumber = {1, 2, 3};
       int [] secoundArrayOfNumber = {4, 5};
       if ( secoundArrayOfNumber.length>firstArrayOfNumber.length) {
           System.out.println("secondArrayOfNumbers is longer");
       }
       else {
           System.out.println("firstArrayOfNumbers is longer");
       }
    }

  }
