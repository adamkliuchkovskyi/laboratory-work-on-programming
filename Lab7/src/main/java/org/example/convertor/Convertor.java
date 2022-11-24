package org.example.convertor;

import java.util.Scanner;

public class Convertor {
    public static String deleteWords(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.matches(".*\\d.*")) {
                result.append(word).append(" ");
                continue;
            }
            if (countVowels(word.toLowerCase()) >= countConsonants(word.toLowerCase())) {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (isConsonant(word.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }

    public static boolean isConsonant(char letter) {
        return letter >= 'a' && letter <= 'z' && !isVowel(letter);
    }
}
