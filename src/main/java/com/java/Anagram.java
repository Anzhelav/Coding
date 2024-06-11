package com.java;

//Two strings, are called anagrams if they contain all the same characters in the same frequencies.
// For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
        // Input strings
        String one = "Cat";
        String two = "Tac";
        // Check if the strings are anagrams and print the result
        System.out.println( isAnagram(one, two));

    }
    // Method to check if two strings are anagrams
    public static boolean isAnagram(String a, String b){
        // Convert strings to upper case and convert to char arrays
       char [] A = a.toUpperCase().toCharArray();
       char [] B = b.toUpperCase().toCharArray();
        // Sort the char arrays
       Arrays.sort(A);
       Arrays.sort(B);
        // Convert sorted arrays back to strings
       a = Arrays.toString(A);
       b = Arrays.toString(B);
        // Check if the sorted strings are equal
       if(a.equals(b)){
           return true; // Return true if they are equal
       }else{
           return false; // Otherwise, return false
       }
    }
}
