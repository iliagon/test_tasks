package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer, Integer> computeOccurrencesOfEachCharacter(String str) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        str.chars().forEach(value ->
                occurrences.compute(value, (key, count) ->
                        count == null ? 1 : count + 1)
        );
        return occurrences;
    }

    public static String sortStringAccordingCustomAlphabetOrder(String sourceString, String alphabet) {
        Map<Integer, Integer> occurrences = computeOccurrencesOfEachCharacter(sourceString);
        StringBuilder sortedString = new StringBuilder(sourceString.length());
        alphabet.chars().forEach(value -> {
            for (int i = 0; i < occurrences.getOrDefault(value, 0); i++)
                sortedString.append((char) value);

        });
        return sortedString.toString();
    }

    public static void main(String[] args) {
        String sortedStr = sortStringAccordingCustomAlphabetOrder("Azcba1", "123AaBbCcZz");
        System.out.println(sortedStr);
    }
}
