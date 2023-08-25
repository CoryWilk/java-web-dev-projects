package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a quote:");
        String quote = input.nextLine();
        String lowerQuote = quote.toLowerCase();
        char[] charactersInString = lowerQuote.toCharArray();

        Map<Character, Integer> counts = new HashMap<>();

        for (char letter : charactersInString) {
            if (counts.containsKey(letter)) {
                counts.put(letter, counts.get(letter) + 1);
            }else {
                counts.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
