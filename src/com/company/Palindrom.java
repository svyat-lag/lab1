package com.company;

import java.util.Scanner;

// Determines whether user's string is a palindrom or not
public class Palindrom {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String usersString = scanner.nextLine();

        if (isPalindrom(usersString)) System.out.println("This string is a palindrom");
        else System.out.println("This string is not a palindrom");
    }

    public static boolean isPalindrom(String s){
        // Checks if the entered string is empty
        if (s.isEmpty()) return true;

        final int MIDDLE_OF_THE_STRING = s.length()/2;

        // Compares the code of the current symbol with the code of the opposite one
        // If the word has odd number of characters, then this function compare the middle character with itself *
        for (int i = 0; i <= MIDDLE_OF_THE_STRING; i++){
            if (((int) s.charAt(i) - (int) s.charAt(s.length()-i-1) != 0) &&
                    ((int) s.charAt(i) - (int) s.charAt(s.length()-i-1) != 32) &&
                    ((int) s.charAt(i) - (int) s.charAt(s.length()-i-1) != -32))
                return false;
        }
        return true;
    }
}
