package dev.haroon.cheatsheet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortElementsByFrequency {

    public static void main(String[] args) {
        int[] arr1 = {5,5,4,6,4};
        int[] arr2 = {9,9,9,2,2,2,2,2,2,2,2,2,5};
        System.out.println(Arrays.toString(sort(arr1)));
        System.out.println(Arrays.toString(sort(arr2)));
    }

    public static int[] sort(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();

        for(int num:arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        while(!freq.isEmpty()) {
            int maxFreq = 0;
            int minKey = Integer.MAX_VALUE;
            for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
                int key = entry.getKey();
                int frequency = entry.getValue();
                 if(frequency > maxFreq || (frequency == maxFreq && key < minKey) ) {
                       maxFreq = frequency;
                       minKey = key;
                 }
            }
            for(int i=0; i<maxFreq; i++) {
                arr[index++] = minKey;
            }
            freq.remove(minKey);
        }

       return arr;
    }

}
