package hackerrank.practice.tutorials.tenDaysOfStatistics;

import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/s10-basic-statistics/problem
public class Day0MeanMedianAndMode {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] numbers = new int[size];
    double mean = 0;
    int[] mode = new int[size];

    for (int i = 0; i < size; i++) {
      numbers[i] = scanner.nextInt();
      mean += numbers[i];
    }
    System.out.printf("%.1f\n", mean / size);

    Arrays.sort(numbers);
    if (size % 2 == 0) {
      System.out.printf("%.1f\n", (numbers[size / 2 - 1] + numbers[size / 2]) / 2.0);
    } else {
      System.out.printf("%.1f\n", (numbers[size / 2]) / 2.0);
    }

    int max = 0;
    for (int i = 0; i < size - 1; i++) {
      int count = 0;
      int j = i + 1;
      while (numbers[i] == numbers[j]) {
        count++;
        j++;
      }
      mode[i] = count;
      max = mode[i] > mode[max] ? i : max;
    }
    System.out.println(numbers[max]);
  }
}
