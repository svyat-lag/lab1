package com.company;

import java.util.Scanner;
import static java.lang.Math.sqrt;

//Prints all prime numbers starting from 2 to the number entered by user
public class Primes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            int usersNumber = scanner.nextInt();

            // Checks if the user's number is negative or equal to zero
            if (usersNumber > 0)
                for (int i = 1; i <= usersNumber; i++) {
                    if (isPrime(i)) System.out.println(i);
                }
            else
                System.out.println("Your number can not be less than 1");

        } catch (Exception e){
            System.out.println("Your number must be integer");
        }
    }

    public static boolean isPrime(int number){
        final double MAXIMUM_DIVISOR = sqrt(number);

        for (int i = 2; i <= MAXIMUM_DIVISOR; i++){
            if (number % i == 0) return false;
        }
        return true;
    }
}
