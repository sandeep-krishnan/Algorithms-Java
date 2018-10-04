package com.sand.algorithms.basic;

public class BaseConversion {

  public static void main(String[] args) {
    System.out.println(new BaseConversion().baseConvert(275, 8));
  }

  public String baseConvert(int num, int base) {
    StringBuilder output = new StringBuilder();
    if (base == 0) {
      return output.toString();
    }

    while (num > 0) {
      output = output.append(String.valueOf(num % base));
      num = num / base;
    }
    //reverse the string
    return output.reverse().toString();
  }
}
