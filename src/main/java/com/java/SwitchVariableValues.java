package com.java;

//Switch variable values without creating third variable
public class SwitchVariableValues {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        a = a + b; // a is now 15
        b = a - b;  // b was 10, when we subtract b from a (15 - 10) we get 5 and save it into b variable which value is now 5
        a = a - b; // a was 15 and we subtract b which value is now 5 from a which value is 15 and 10 which we save into a variable
        System.out.println(a + " " + b);
        
    }}
