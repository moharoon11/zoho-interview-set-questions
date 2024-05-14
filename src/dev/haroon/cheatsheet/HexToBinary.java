package dev.haroon.cheatsheet;

public class HexToBinary {

    public static void main(String[] args) {
        System.out.println("Binary value of 1BC is " + hexToDecimalThenBinary("1BC"));


    }

    public static String hexToDecimalThenBinary(String s) {
        String hexValues = "0123456789ABCDEF";
        s = s.toUpperCase();
        int decimal = 0;
        int last = s.length() - 1;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(last--);
            int digit = hexValues.indexOf(c);

            // if you use last the below line is correct
            decimal += Math.pow(16, i) * digit;
            // if you dont use last then use below line instead of above one
            // decimal += Math.pow(16, s.length() - 1 - i) * digit, both are correct
        }
        System.out.println("Decimal value of " + s + " is " + decimal);
        return decimalToBinary(decimal);
    }




    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }
}
