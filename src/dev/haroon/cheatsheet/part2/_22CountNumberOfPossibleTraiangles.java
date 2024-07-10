package dev.haroon.cheatsheet.part2;

// Gfg question

import java.util.Arrays;

/**
 * Count the number of possible triangles
 * Difficulty: MediumAccuracy: 28.53%Submissions: 101K+Points: 4
 *
 * Given an unsorted array arr[] of n positive integers. Find the number of triangles that can be formed with three different array elements as lengths of three sides of triangles.
 *
 * Example 1:
 *
 * Input:
 * n = 3
 * arr[] = {3, 5, 4}
 * Output:
 * 1
 * Explanation:
 * A triangle is possible
 * with all the elements 5, 3 and 4.
 *
 * Example 2:
 *
 * Input:
 * n = 5
 * arr[] = {6, 4, 9, 7, 8}
 * Output:
 * 10
 * Explanation:
 * There are 10 triangles
 * possible  with the given elements like
 * (6,4,9), (6,7,8),...
 *
 *
 *
 * Your Task:
 * This is a function problem. You only need to complete the function findNumberOfTriangles() that takes arr[] and n as input parameters and returns the count of total possible triangles.
 *
 * Expected Time Complexity: O(n2).
 * Expected Space Complexity: O(1).
 *
 * Constraints:
 * 3 <= n <= 103
 * 1 <= arr[i] <= 103
 */
public class _22CountNumberOfPossibleTraiangles {


    public static void main(String[] args) {
     int[] arr = {3, 5, 4};
        System.out.println(countPossibleTraingles1(arr));
        System.out.println(countPossibleTraiangles(arr));
    }

    // brute force approach -> check for all possible triplets
    // to form a possible traingle the summation of 2 sides
    // of the traingale should be greater then the thrid side
    // the traingle inequality equation is a + b > c

    public static int countPossibleTraingles1(int[] arr) {
        int count = 0;
        int n = arr.length;

        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    if(arr[i] + arr[j] > arr[k] &&
                       arr[i] + arr[k] > arr[j] &&
                       arr[j] + arr[k] > arr[i]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    // better approach
    public static int countPossibleTraiangles(int[] arr) {
        if(arr.length < 3) return -1;
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                int start = j + 1;
                int end = n - 1;
                int k = j;

                while(start <= end) {
                    int mid = start + ((end - start) >> 1);

                    if(arr[i] + arr[j] > arr[mid]) {
                        k = mid;
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }

                count += k - j;
            }
        }

        return count;
    }

    // optimal solution

    public static int findNumberOfTriangles(int[] arr, int n) {
        Arrays.sort(arr);
        int count = 0;

        // Iterate over the sorted array, fixing the third element (largest side) as arr[k]
        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;
            while (i < j) {
                // Check if arr[i] + arr[j] > arr[k]
                if (arr[i] + arr[j] > arr[k]) {
                    // All elements between i and j will also satisfy the condition
                    count += j - i;
                    j--; // Move j leftwards
                } else {
                    i++; // Move i rightwards
                }
            }
        }

        return count;
    }



}
