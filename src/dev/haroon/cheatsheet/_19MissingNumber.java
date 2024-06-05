package dev.haroon.cheatsheet;

import java.util.Arrays;

public class _19MissingNumber {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4};
        System.out.println(findMissingNumber1(arr));
    }


    public static int findMissingNumber1(int[] arr) {
        int n = arr.length;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for(int i=0; i<arr.length; i++) arraySum += arr[i];
        return totalSum - arraySum;
    }

    // 0  1  3
    //       s
    //       e
    //       m
    // binary search
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > mid) end = mid - 1;
            else start = mid + 1;
        }

        return start;
    }
}
