package dev.haroon.cheatsheet.part1;


// use hashmap to caluculate frequency and optimize it
// optimal solution is: bitwise xor operator
public class _16FindElementAppearsOnce {

    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}));
    }

    public static int singleNonDuplicate(int[] nums) {

        int element = 0;
        int[] frequency = countFrequency(nums);

        for(int num:nums) {
            if(frequency[num] == 1) {
                element = num;
                break;
            }
        }

        return element;
    }

    public static int[] countFrequency(int[] nums) {
        int max = 0;
        for(int num:nums) {
            if(num > max) {
                max = num;
            }
        }

        int[] freq = new int[max + 1];

        for(int num:nums) {
            freq[num]++;
        }

        return freq;
    }
}
