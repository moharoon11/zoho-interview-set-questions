package dev.haroon.cheatsheet.part1;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class DistinctDigitArray {

    public static void main(String[] args) {
        int[] arr1 = {111, 222, 333, 444, 666};
        int[] arr2 = {123, 451};
        System.out.println(Arrays.toString(func2(arr1)));
        System.out.println(Arrays.toString(func2(arr2)));

    }

    public static int[] func(int[] arr) {
        Set<Integer> distinctDigits = new HashSet<>();

        for(int num:arr) {
            String value = String.valueOf(num);
            for(char c:value.toCharArray()) {
                int n = Character.getNumericValue(c);
                distinctDigits.add(n);
            }
        }
        return distinctDigits.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] func2(int[] nums) {
        int[] distinctDigits = new int[0];

        for (int num : nums) {
            String value = String.valueOf(num);
            for (char ch : value.toCharArray()) {
                int digit = ch - '0';
                if (!contains(distinctDigits, digit)) {
                    distinctDigits = Arrays.copyOf(distinctDigits, distinctDigits.length + 1);
                    distinctDigits[distinctDigits.length - 1] = digit;
                }
            }
        }

        return distinctDigits;
    }

    public static boolean contains(int[] distinct, int digit) {
        for(int num:distinct) {
            if(num == digit) {
                return true;
            }
        }

        return false;
    }

}
