public class maximum {
  public static void main(String[] args) {
    // Write a function that finds the largest element of an array using recursion.
    int inputNumbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(findLargestNumber(inputNumbers, inputNumbers.length));
  }

  public static int findLargestNumber(int[] numbers, int n) {
    if (n == 1) return numbers[0];
    return Math.max(numbers[n - 1], findLargestNumber(numbers, n - 1));
  }
}