package dev.haroon.cheatsheet;

public class CheckForSubSequence {

    public static void main(String[] args) {

        String a = "AXY";
        String b = "YADXCP";
        String aa = "gksrek";
        String bb = "geeksforgeeks";

        System.out.println(check(a, b));
        System.out.println(check(aa, bb));


    }

    public static boolean check(String a, String b) {
        int i = 0;
        int j = 0;
        while(i<a.length() && j < b.length()) {
            if(a.charAt(i) == b.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == a.length();
    }

}
