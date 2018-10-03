package com.sand.algorithms.basic;

public class Fibonacci {
  public static void main(String[] args) {
    new Fibonacci().printFibonacciNumbers(10);
  }

  /**
   * Prints the fibonacci numbers
   *
   * @param n - the number of numbers to be printed
   */
  public void printFibonacciNumbers(int n) {
    if (n <= 0) {
      return;
    }

    int a = 0, b = 1;
    System.out.printf("\nIndex\t\tNumber");
    System.out.printf("\n\t1\t=\t%d", a);
    System.out.printf("\n\t2\t=\t%d", b);
    if (n <= 2) {
      return;
    }

    int c;

    for (int i = 3; i <= n; i++) {
      c = a + b;
      a = b;
      b = c;
      System.out.printf("\n\t%d\t=\t%d", i, c);
    }
  }
}
