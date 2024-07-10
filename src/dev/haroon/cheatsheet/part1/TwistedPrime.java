package dev.haroon.cheatsheet.part1;

public class TwistedPrime {

    public static void main(String[] args) {
        System.out.println(isTwistedPrime(97));
        System.out.println(isTwistedPrime(43));
    }

    public static int isTwistedPrime(int num) {
        boolean isNumPrime = false;
        boolean isNumTwistedPrime = false;
        isNumPrime = PrintNPrimeNumbers.isPrime(num);
        int reverseNum = Integer.parseInt(new StringBuffer("" + num).reverse().toString());
        isNumTwistedPrime = PrintNPrimeNumbers.isPrime(reverseNum);
        return isNumPrime == isNumTwistedPrime ? 1 : 0;
    }

}
