package com.company;

import static java.lang.Math.sqrt;
//Finds prime numbers in range 1..100
public class Primes {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
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
