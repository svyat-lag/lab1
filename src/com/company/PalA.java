package com.company;

import java.util.Scanner;

public class PalA {
    // Determines whether user's string is a palindrom or not
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String usersString = scanner.nextLine();
        if (isPalindrom(usersString)) System.out.println("This string is a palindrom");
        else System.out.println("This string is not a palindrom");
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++){
            result = s.charAt(i) + result;
        }
        return result;
    }

    public static boolean equalTo(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (((int) s1.charAt(i) - (int) s2.charAt(i) != 0 ) &&
                        ((int) s1.charAt(i) - (int) s2.charAt(i) != 32) &&
                        ((int) s1.charAt(i) - (int) s2.charAt(i) != -32))
                    return false;
            }
            return true;
        }
    }

    public static boolean isPalindrom(String s) {
        if (equalTo(s, reverseString(s))) return true;
        return false;
    }
}