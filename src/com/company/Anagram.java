package com.company;

public class Anagram {
    public static String process(String text) {
        char[] characters = text.toCharArray();
        int numOfChars = characters.length;
        for (int i = 0; i < numOfChars / 2; i++) {
            if (areBothCharacters(characters, i, numOfChars - 1 - i)) {
                swapCharacters(characters, i, numOfChars - 1 - i);
            }
        }
        return String.copyValueOf(characters);
    }
    private static boolean areBothCharacters(char[] characters, int position1, int position2) {
        return Character.isLetter(characters[position1]) && Character.isLetter(characters[position2]);
    }

    private static void swapCharacters(char[] characters, int position1, int position2) {
        char swap = characters[position1];
        characters[position1] = characters[position2];
        characters[position2] = swap;
    }
}
