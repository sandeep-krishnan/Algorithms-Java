package com.sand.algorithms.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

  public static void main(String[] args) {
    int[] array = new int[] {1, 1, 2, 3, 3, 3, 7, 7, 8, 9, 9};
    new RemoveDuplicatesFromSortedArray().removeDuplicatesFromSortedArray(array);
    System.out.println(Arrays.toString(array));
  }

  public void removeDuplicatesFromSortedArray(int[] array) {
    int i = 0, j = 1;
    while (j < array.length) {
      while (j < array.length && array[i] == array[j]) {
        j++;
      }
      if (!(j < array.length)) {
        break;
      }
      array[++i] = array[j++];
    }

    for (int k = i + 1; k < array.length; k++) {
      array[k] = 0;
    }
  }
}
