package dev.haroon.cheatsheet;
// leetcode 2027
public class _18TransformString {

    public static void main(String[] args) {

    }

    public static int minimumMovesToConvertString(String s) {

        int i=0;
        int res = 0;

        while(i < s.length()) {
            if(s.charAt(i) == 'X') {
                res++;
                i+=3;
            } else {
                i++;
            }
        }

        return res;
    }

    public static int minimumMoves(String s) {
        char[] ch=s.toCharArray();
        int ctr=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='X')
            {
                i+=2;
                ctr++;
            }
        }
        return ctr;
    }
}
