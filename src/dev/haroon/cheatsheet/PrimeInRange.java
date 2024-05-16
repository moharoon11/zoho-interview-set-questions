package dev.haroon.cheatsheet;

import java.util.ArrayList;
import java.util.List;

public class PrimeInRange {
    public static void main(String[] args) {
          System.out.println(primesInRange(-10,15));
    }

    public static List<Integer> primesInRange(int start, int end) {
        List<Integer> primes = new ArrayList<Integer>();

         if(start > end) {
             int temp = start;
             start = end;
             end = start;
         }

         if(start < 2) {
             start = 2;
         }

         while(start <= end) {
             if(isPrime(start)) {
                 primes.add(start);
             }
             start++;
         }

        return primes;
    }


    public static boolean isPrime(int num) {
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

}
