package com.sand.algorithms.arrays;

import com.sand.algorithms.utils.ArrayUtils;

import java.util.Arrays;

public class ArrayPartitioning {
  public static void main(String[] args) {
    Integer[] array = new Integer[] {5, 3, 8, 2, 7, 6, 1};
    new ArrayPartitioning().partitionArray(array, 5);
    System.out.println(Arrays.toString(array));
  }

  public void partitionArray(Integer[] array, int key) {
    int i = 0, j = array.length - 1;
    while (array[i] <= key && i < array.length) i++;
    while (array[j] > key && j >= i) j--;

    while (i < j) {
      ArrayUtils.swap(array, i, j);
        while (array[i] <= key && i < array.length) i++;
        while (array[j] > key && j >= i) j--;
    }

    System.out.println("Partition index is " + i);
  }
}
