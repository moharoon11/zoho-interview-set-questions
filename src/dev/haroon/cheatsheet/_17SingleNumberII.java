package dev.haroon.cheatsheet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// this question and find element appear ones are same
public class _17SingleNumberII {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 0, 1, 99};


        System.out.println(singleNumber(new int[]{0,0,0,1,1,1,10,99, 99}));
        System.out.println(singleNumber(new int[] {1,1}));
        System.out.println(singleNumberHashMap(new int[]{0,0,0,1,1,1,10,99, 99}));
        System.out.println(singleNumberHashMap(new int[] {1,1}));
    }

    public static int singleNumberHashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num:nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num:nums) {
            if(map.get(num) == 1) return num;
        }
        return -1;
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);


        // check the first one
        if(nums.length == 1 || nums[0] != nums[1]) {
            return  nums[0];
        }

        // check the middle ones
        for(int i=1; i<nums.length - 1; i++) {
            if(nums[i] != nums[i-1] && nums[i] != nums[i+1]) return nums[i];
        }

        // check the last one
        if(nums[nums.length - 1] != nums[nums.length -2]) return nums[nums.length-1];

        return -1;
    }
}
