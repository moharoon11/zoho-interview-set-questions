package dev.haroon.set1;

import java.util.HashSet;
import java.util.Set;

/**
 1. Pangram Checking

 Check whether all english alphabets are present in the given sentence or not

 I/P: abc defGhi JklmnOP QRStuv wxyz

 O/P: True

 I/P: abc defGhi JklmnOP QRStuv

 O/P: False
 */

// note: using hashset is better approach then using array to solve this problem
public class PangramChecking {

    public static void main(String[] args) {
        String sentence1 = "abcdefghijklmnopqrstuvwxyz";
        String sentence2 = "its not an pangram sentence";

        System.out.println(checkIfPangram(sentence1));
        System.out.println(checkIfPangram(sentence2));

        System.out.println();

        System.out.println(isPangram(sentence1));
        System.out.println(isPangram(sentence2));

    }

    // using hashset
    private static boolean checkIfPangram(String sentence) {

        Set<Character> alphabets = new HashSet<Character>();

        for(char ch = 'a'; ch <= 'z'; ch++) {
            alphabets.add(ch);
        }

        for(int i=0; i<sentence.length(); i++) {
            alphabets.remove(sentence.charAt(i));
            if(alphabets.isEmpty()) {
                return true;
            }
        }

        return false;
    }
    
    // using arrays
    private static boolean isPangram(String sentence) {

        boolean[] alphabets = new boolean[26];

        for(int i=0; i<sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                alphabets[ch - 'a'] = true;
            }
        }

        for(boolean isPresent: alphabets) {
            if(!isPresent) {
                return false;
            }
        }

        return true;
    }
}
