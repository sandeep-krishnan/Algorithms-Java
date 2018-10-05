package com.sand.algorithms.utils;

public class ArrayUtils {
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
