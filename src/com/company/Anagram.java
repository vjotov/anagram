package com.company;

import java.util.StringJoiner;

public class Anagram {
    public static String process(String text) {
        String delimiter = " ";
        StringJoiner result = new StringJoiner(delimiter);

        for (String word : text.split(delimiter)) {
            result.add(processWord(word));
        }

        return result.toString();
    }

    private static String processWord(String text) {
        char[] characters = text.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        while (left < right) {
            if (! Character.isLetter(characters[left])) {
                left++;
            } else if (! Character.isLetter(characters[right])) {
                right--;
            } else {
                swapCharacters(characters, left, right);
                left++;
                right--;
            }
        }
        return String.copyValueOf(characters);
    }

    private static void swapCharacters(char[] characters, int position1, int position2) {
        char swap = characters[position1];
        characters[position1] = characters[position2];
        characters[position2] = swap;
    }
}
