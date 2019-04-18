package hackerrank.practice.tutorials.tenDaysOfStatistics;

import java.util.Arrays;
import java.util.Scanner;

public class Day1Quartiles {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] numbers = new int[size];
    int[] lowers;
    int[] uppers;

    for (int i = 0; i < size; i++) {
      numbers[i] = scanner.nextInt();
    }
    Arrays.sort(numbers);
    lowers = Arrays.copyOfRange(numbers, 0, size / 2);
    if (size % 2 == 0)
      uppers = Arrays.copyOfRange(numbers, size / 2, size);
    else
      uppers = Arrays.copyOfRange(numbers, size / 2 + 1, size);

    getMedianAndPrint(lowers);
    getMedianAndPrint(numbers);
    getMedianAndPrint(uppers);
  }

  private static void getMedianAndPrint(int[] intArray) {
    int size = intArray.length;
    if (size % 2 == 0) {
      System.out.println((intArray[size / 2 - 1] + intArray[size / 2]) / 2);
    } else
      System.out.println(intArray[size / 2]);
  }
}
