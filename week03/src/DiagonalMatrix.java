import java.util.Arrays;

// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
  public class DiagonalMatrix {
  public static void main(String[] args) {
    String[][] matrixArray = new String[4][4];

    for (int i = 0; i < matrixArray.length; i++) {
      for (int j = 0; j < matrixArray[i].length; j++) {
        if (i == j) {
          matrixArray[i][j] = "1";
        } else {
          matrixArray[i][j] = "0";
        }
      }
    }

    for (int i = 0; i < matrixArray.length; i++) {
      for (int j = 0; j < matrixArray[i].length; j++) {
        System.out.print(matrixArray[i][j] + " ");
      }
      System.out.println();
    }
  }
}
