package dev.haroon.cheatsheet;

import java.util.Arrays;
import java.util.Comparator;


public class SpecificSort {


    public static void main(String[] args) {

        Long[] arr1 = {1L, 2L, 3L, 5L, 4L, 7L, 10L};
        Long[] arr11 = {1L, 2L, 3L, 5L, 4L, 7L, 10L};
        Long[] arr2 = {0L, 4L, 5L, 3L, 7L, 2L, 1L};

        customSort1(arr1);
        customSort(arr11);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr11));
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

    private static void customSort1(Long[] nums) {
        int n = nums.length;

        boolean swapped;

        do {
            swapped = false;
            for(int i=0; i<n-1; i++) {
                if(compare(nums[i], nums[i+1]) > 0) {
                    Long temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while(swapped);
    }

    private static int compare(Long a, Long b) {

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
}
