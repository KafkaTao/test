package test2math;

public class prime {
    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
}
    public static void main(String[] args) {
        int n = 7; // assuming n is initialized here for testing
        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        System.out.println(isPrime(7));
    }

	
}
/*
C++ version of isPrime function

#include <iostream>
#include <cmath>

bool isPrime(long number) {
    if (number <= 1) {
        return false;
    }
    for (long i = 2; i <= sqrt(number); i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    int n = 7; // assuming n is initialized here for testing
    if (isPrime(n)) {
        std::cout << "Prime" << std::endl;
    } else {
        std::cout << "Not Prime" << std::endl;
    }
    std::cout << std::boolalpha << isPrime(7) << std::endl;
    
    return 0;
}*/       