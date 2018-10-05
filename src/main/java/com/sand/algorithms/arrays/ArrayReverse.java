package com.sand.algorithms.arrays;

import com.sand.algorithms.utils.ArrayUtils;

import java.util.Arrays;

public class ArrayReverse {

  public static void main(String[] args) {
    Integer[] array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8};
    new ArrayReverse().arrayReverse(array);
    System.out.println(Arrays.toString(array));
  }

  public void arrayReverse(Integer[] array) {
    if (array == null) {
      return;
    }
    int length = array.length;
    for (int i = 0; i < length / 2; i++) {
      ArrayUtils.swap(array, i, length - 1 - i);
    }
  }
}
