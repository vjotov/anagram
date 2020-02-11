package com.company;

import java.util.Scanner;

public class AnagramApp {


    public static void main(String[] args) {
        String userInput = getInput();
        String anagram = Anagram.process(userInput);
        System.out.println("The anagram is: " + anagram);
    }

    private static String getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your text: ");
        return in.nextLine();
    }

}
