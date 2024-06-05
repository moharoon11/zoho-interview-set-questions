package dev.haroon.cheatsheet;

public class IndexOfExtraElement {

    public static void main(String[] args) {
       System.out.println(findExtra(new int[] {1,2,3,5}, new int[] {1,2,3,4,5}));
    }

    public static int findExtra(int[] a, int[] b) {
        for(int i=0; i<b.length; i++)
            if(a[i] != b[i]) return i;
        return a.length - 1;
    }

}
