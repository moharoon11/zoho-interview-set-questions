package dev.haroon.cheatsheet;

public class MinNoCurrencyNotes {

    public static void main(String[] args) {
        calculate(3001);
    }

    public static void calculate(int amount) {

        if(amount <= 0) return;
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 1};
        int[] noteCounter = new int[notes.length];

        for(int i=0; i<notes.length; i++) {

            // approach 1
//            while(amount >= notes[i]) {
//                noteCounter[i]++;
//                amount -= notes[i];
//            }

            // approach 2
            if(amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                 amount = amount % notes[i]; /** (or) amount -= notes[i] * noteCounter[i]*/
            }
        }

        for(int i=0; i<noteCounter.length; i++) {
            if(noteCounter[i] != 0)
              System.out.println("Currency = " + notes[i] + " * " + noteCounter[i]);
        }
    }
}
