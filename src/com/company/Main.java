package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Think Java - Exercise 6.4

        //Import Statement.
        Scanner userInput = new Scanner(System.in);

        //Program waiting for an input.
            System.out.println("Insert a word and lets see if it's a abecedarian: ");
            String word = userInput.next();

        //Invokes method.
        if (isAbecedarian(word) == true) {
            System.out.println("The inserted word is abecedarian!");
        }else {
            System.out.println("The inserted word is not abecedarian!");
        }

    }

    public static boolean isAbecedarian(String s) {

        //For loop.
        for (char c = 0; c < s.length() - 1; c++) {

           //Not 100% sure what happens here.
           if (s.charAt(c) <= s.charAt(c + 1)) {
           }
           else {
               //Returns if input is not abecedarian.
               return (false);
           }
        }
        //Returns if input is abecedarian.
        return (true);
    }

}
