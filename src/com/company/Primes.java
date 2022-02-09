package com.company;

import java.util.Scanner;
import static java.lang.Math.sqrt;

//Prints all prime numbers starting from 2 to the number entered by user
public class Primes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            if (isPrime(i)) System.out.println(i);
        }
    }

    public static boolean isPrime(int n){
        for (int i = 2; i <= sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}
