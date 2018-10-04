package com.sand.algorithms.arrays;

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
      swap(array, i, length - 1 - i);
    }
  }

  public static <T> void swap(T[] array, int x, int y) {
    if (array == null) {
      return;
    }

    if (x > array.length || y > array.length) {
      return;
    }

    T temp = array[x];
    array[x] = array[y];
    array[y] = temp;
  }
}
