package com.sand.algorithms.basic;

public class ReverseDigits {

  public static void main(String[] args) {
    System.out.println(new ReverseDigits().reverseDigits(1234567));
  }

  public int reverseDigits(int input) {
    int output = 0;

    while (input > 0) {
      int lastDigit = input % 10;
      input /= 10;
      output = output * 10 + lastDigit;
    }

    return output;
  }
}
