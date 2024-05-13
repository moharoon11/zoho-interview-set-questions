package dev.haroon.cheatsheet;

import java.util.Arrays;
import java.util.Comparator;

/**
 * package dev.haroon.cheatsheet;
 *
 * public class SpecificSort {
 *
 *     public static void customSort(Long[] arr) {
 *         int n = arr.length;
 *         boolean swapped;
 *         do {
 *             swapped = false;
 *             for (int i = 0; i < n - 1; i++) {
 *                 if (compare(arr[i], arr[i + 1]) > 0) {
 *                     Long temp = arr[i];
 *                     arr[i] = arr[i + 1];
 *                     arr[i + 1] = temp;
 *                     swapped = true;
 *                 }
 *             }
 *             n--;
 *         } while (swapped);
 *     }
 *
 *     private static int compare(Long a, Long b) {
 *         if (a % 2 == 0 && b % 2 != 0) {
 *             return 1;
 *         } else if (a % 2 != 0 && b % 2 == 0) {
 *             return -1;
 *         } else if (a % 2 == 0) {
 *             return a.compareTo(b);
 *         } else {
 *             return b.compareTo(a);
 *         }
 *     }
 *
 *     public static void main(String[] args) {
 *         Long[] arr = {1L, 2L, 3L, 5L, 4L, 7L, 10L};
 *         customSort(arr);
 *         for (Long num : arr) {
 *             System.out.print(num + " ");
 *         }
 *     }
 * }
 */
public class SpecificSort {


    public static void main(String[] args) {

        Long[] arr1 = {1L, 2L, 3L, 5L, 4L, 7L, 10L};
        Long[] arr2 = {0L, 4L, 5L, 3L, 7L, 2L, 1L};

        customSort(arr1);
        customSort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }


    public static void customSort(Long[] arr) {
        Arrays.sort(arr, new Comparator<Long>() {
            public int compare(Long a, Long b) {

                if(a % 2 == 0 && b % 2 != 0) {
                    return 1;
                } else if(a % 2 != 0 && b % 2 == 0) {
                    return -1;
                } else if(a % 2 == 0) {
                    return a.compareTo(b);
                } else {
                    return b.compareTo(a);
                }
            }
        });
    }
}
