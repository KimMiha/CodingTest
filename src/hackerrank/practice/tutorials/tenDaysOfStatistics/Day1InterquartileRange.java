package hackerrank.practice.tutorials.tenDaysOfStatistics;

import java.util.Arrays;
import java.util.Scanner;

public class Day1InterquartileRange {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] elements = new int[size];
    int[] frequency = new int[size];
    int fullSize = 0;
    int[] fullNumbers;
    int[] lowers;
    int[] uppers;

    for (int i = 0; i < size; i++) {
      elements[i] = scanner.nextInt();
    }
    for (int i = 0; i < size; i++) {
      frequency[i] = scanner.nextInt();
      fullSize += frequency[i];
    }
    fullNumbers = new int[fullSize];

    int cnt = 0;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < frequency[i]; j++) {
        fullNumbers[cnt] = elements[i];
        cnt++;
      }
    }
    Arrays.sort(fullNumbers);

    lowers = Arrays.copyOfRange(fullNumbers, 0, fullSize / 2);
    if (size % 2 == 0)
      uppers = Arrays.copyOfRange(fullNumbers, fullSize / 2, fullSize);
    else
      uppers = Arrays.copyOfRange(fullNumbers, fullSize / 2 + 1, fullSize);

    double q1 = getMedian(lowers);
    double q3 = getMedian(uppers);
    System.out.println(q3 - q1);

  }

  private static double getMedian(int[] intArray) {
    int size = intArray.length;
    if (size % 2 == 0) {
      return (double) (intArray[size / 2 - 1] + intArray[size / 2]) / 2.0;
    } else
      return intArray[size / 2];
  }
}
