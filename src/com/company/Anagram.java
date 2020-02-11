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

        for (int i = 0, j= characters.length; i < j; i++) {
            if (! Character.isLetter(characters[i])) {
                continue;
            } else {
                for(j-- ; i < j; j--) {
                    if (! Character.isLetter(characters[j])) {
                        continue;
                    } else {
                        swapCharacters(characters, i, j);
                        break;
                    }
                }
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
