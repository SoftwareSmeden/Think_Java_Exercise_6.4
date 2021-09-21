package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Think Java - Exercise 6.4

        //Import Statement.
        Scanner userInput = new Scanner(System.in);

        //Program waiting for an input.
            System.out.println("Type a word and lets see if it's an abecedarian: ");
            String word = userInput.next();

        //Invokes method.
        if (isAbecedarian(word)) {
            System.out.println("The word is abecedarian!");
        }else {
            System.out.println("The word is not abecedarian!");
        }

    }

    public static boolean isAbecedarian(String s) {

        //For loop. Starting at index 1.
        for (char c = 1; c < s.length(); c++) {

           //Checking if the letter is bigger or equal to the previous index letter.
           if (s.charAt(c) >= s.charAt(c - 1)) {
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
