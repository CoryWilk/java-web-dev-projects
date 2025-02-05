package org.launchcode;

import java.util.Scanner;
public class ExtendedAlice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: once " +
                "or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use " +
                "of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search term:");
        String searchTerm = input.nextLine().toLowerCase();

        Boolean found = sentence.toLowerCase().contains(searchTerm);
        System.out.println("Search term found: " + found);

        Integer index = sentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = sentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);

    }
}
