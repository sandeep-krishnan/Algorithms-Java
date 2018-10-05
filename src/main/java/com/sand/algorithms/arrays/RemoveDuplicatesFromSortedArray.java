package com.sand.algorithms.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

  public static void main(String[] args) {
    int[] array = new int[] {1, 2, 2, 3, 4, 4, 7, 7, 8};
    new RemoveDuplicatesFromSortedArray().removeDuplicatesFromSortedArray2(array);
    System.out.println(Arrays.toString(array));
  }

  public void removeDuplicatesFromSortedArray2(int[] array) {
    int currIndex = 1, i = 1;

    while (i < array.length) {
      while (i < array.length && array[i] == array[i - 1]) {
        i++;
      }
      if(i >= array.length)
        break;
      array[currIndex++] = array[i++];
    }

    for (int k = currIndex; k < array.length; k++) {
      array[k] = 0;
    }
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
