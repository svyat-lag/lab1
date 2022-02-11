package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

// Determines whether user's string is a palindrom or not
public class Palindrom {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String usersString = scanner.nextLine();

        try {
            if (isPalindrom(usersString)) System.out.println("This string is a palindrom");
            else System.out.println("This string is not a palindrom");
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static boolean isPalindrom(@NotNull String s){
        final int MIDDLE_OF_THE_STRING = s.length()/2;
        char[] sArray = s.toCharArray();

        // Compares current symbol with the opposite one
        // If the word has odd number of characters, then this function compare the middle character with itself *
        for (int i = 0; i <= MIDDLE_OF_THE_STRING; i++){
            if (sArray[i] != sArray[s.length()-i-1]) return false;
        }
        return true;
    }
}
