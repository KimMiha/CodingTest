package hackerrank.practice.tutorials.tenDaysOfStatistics;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/s10-weighted-mean/problem
public class Day0WeightedMean {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] xArr = new int[size];
    int[] wArr = new int[size];
    double x = 0.0;
    double w = 0.0;

    for (int i = 0; i < size; i++) {
      xArr[i] = scanner.nextInt();
    }

    for (int i = 0; i < size; i++) {
      wArr[i] = scanner.nextInt();
      x += xArr[i] * wArr[i];
      w += wArr[i];
    }

    System.out.printf("%.1f", x / w);
  }
}
