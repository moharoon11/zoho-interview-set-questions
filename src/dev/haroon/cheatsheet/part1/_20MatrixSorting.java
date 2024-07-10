package dev.haroon.cheatsheet.part1;

import java.util.Collections;
import java.util.ArrayList;

public class _20MatrixSorting {
    public int[][] diagonalSort(int[][] arr) {

        int row = arr.length;
        int col =  arr[0].length;


        for(int i=0; i<col; i++) {
            sort(arr, 0, i, row, col);
        }

        for(int i=1; i<row; i++) {
            sort(arr, i, 0, row, col);
        }

        return arr;
    }

    public static void sort(int[][] arr, int r, int c, int m, int n) {
        ArrayList<Integer> values = new ArrayList<Integer>();

        int row = r;
        int col = c;

        while(row < m && col < n) {
            values.add(arr[row][col]);
            row++;
            col++;
        }

        Collections.sort(values);

        row = r;
        col = c;
        int idx = 0;
        while(row < m && col < n) {
            arr[row++][col++] = values.get(idx++);
        }
    }


}