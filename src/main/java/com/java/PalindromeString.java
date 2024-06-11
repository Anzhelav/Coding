package com.java;

import java.util.Scanner;
/*
 * This Java program checks whether a given word is a palindrome or not.
 * A palindrome is a word that reads the same backward as forward.
 * The program prompts the user to enter a word, then determines if it's a palindrome.
 * It utilizes a helper function isPalindrome() to perform the check.
 */

public class PalindromeString {
    // Main method where execution begins
    public static void main(String[]args){
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a word
        System.out.println("Enter your word to check if it is palindrome or not:");
        String word = scanner.nextLine();
        // Call the isPalindrome() method and print the result
        System.out.println(isPalindrome(word));

    }
    // Method to check if a given word is a palindrome
    public static boolean isPalindrome(String word) {
        // Initialize an empty string to store the reversed word
        String reversed = "";
        // Iterate through the characters of the word in reverse order
        for (int i = word.length() - 1; i >= 0; i--) {
            // Append each character to the reversed string
            reversed = reversed + word.charAt(i);
        }
        // Check if the original word is equal to its reverse, ignoring case
        if (word.equalsIgnoreCase(reversed)) {
            // If they are equal, return true (word is a palindrome)
            return true;
        } else {
            // If not, return false (word is not a palindrome)
            return false;
        }
    }
}
