package hackerrank.practice.tutorials.tenDaysOfStatistics;

import java.util.Scanner;

public class Day1StandardDeviation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] numbers = new int[size];
    double ave = 0;

    for (int i = 0; i < size; i++) {
      numbers[i] = scanner.nextInt();
      ave += numbers[i];
    }
    ave /= size;

    double xSum = 0;
    for (int i : numbers) {
      xSum += Math.pow(i - ave, 2.0);
    }
    double result = Math.sqrt(xSum / size);
    System.out.printf("%.1f", result);
  }
}

/** TEST CASE
 10
 64630 11735 14216 99233 14470 4978 73429 38120 51135 67060

 Expected
 30466.9


 20
 6392 51608 71247 14271 48327 50618 67435 47029 61857 22987 64858 99745 75504 85464 60482 30320 11342 48808 66882 40522

 Expected
 24245.5
 */