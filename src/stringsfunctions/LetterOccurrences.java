package stringsfunctions;

import java.util.*;
import java.util.Scanner;

public class LetterOccurrences {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the string to analyze:");
        String orgString = s1.nextLine();

        // Convert the string to lowercase to handle case insensitivity
        orgString = orgString.toLowerCase();

        // Array to store the frequency of each letter (26 letters in the alphabet)
        int[] frequency = new int[26];

        // Iterate through the string
        for (int i = 0; i < orgString.length(); i++) {
            char ch = orgString.charAt(i);
            if (Character.isLetter(ch)) {
                // Increment the count for the corresponding letter
                frequency[ch - 'a']++;
            }
        }

        // Print the occurrences of each letter
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + frequency[i]);
            }
        }
    }
}
