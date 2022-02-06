package com.company;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (isPalindrom(s)) System.out.println("This string is a palindrom");
        else System.out.println("This string is not a palindrom");
    }

    public static boolean isPalindrom(String s){
        // Transforms the given string to array
        char[] sArray = s.toCharArray();

        // Compares current symbol with the opposite one
        // If the word has odd number of characters, then this function compare it with itself
        for (int i = 0; i <= s.length()/2; i++){
            if (sArray[i] != sArray[s.length()-i-1]) return false;
        }
        return true;
    }
}
