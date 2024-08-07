package dev.haroon.cheatsheet.part1;

import java.util.Arrays;

public class _15MoveZerosToEndOFArray {

    public static void main(String[] args) {

             System.out.println(Arrays.toString(moveZeros(new int[] {1,2,0,0,3,4,0})));
             int[] arr1 = new int[]{1,3,0,0,4,4,0};
             moveZerosInplace(arr1);
             System.out.println(Arrays.toString(arr1));
    }

    public static int[] moveZeros(int[] arr) {
        int[] newArr = new int[arr.length];

        int i = 0;
        int j = 0;
        int k = newArr.length - 1;

        while(i < arr.length) {
            if(arr[i] != 0)
                newArr[j++] = arr[i++];
             else
                newArr[k--] = arr[i++];

        }
        return newArr;
    }

    // better approach -> array in place

    public static void moveZerosInplace(int[] arr) {
        int nonZeroIndex = 0;

        for(int num:arr) {
            if(num != 0)
                arr[nonZeroIndex++] = num;
        }
        while(nonZeroIndex < arr.length)
            arr[nonZeroIndex++] = 0;

    }


    // optimal approach
    public void moveZeroes(int[] nums) {

        if(nums.length == 1) return;

        int j = -1;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                j = i;
                break;
            }
        }

        if(j == -1) return;


        for(int i=j+1; i<nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

}
