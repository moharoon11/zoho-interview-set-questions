package dev.haroon.cheatsheet;

public class PrintNPrimeNumbers {

    public static void main(String[] args) {
        printNPrime(5);
    }

    public static void printNPrime(int n)
    {

        int count = 0;
        int num = 2;

        while(count < n) {
            if(isPrime(num)) {
                System.out.print(num + ", ");
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if(num <= 1) return false;

        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }

        return true;
    }

}
