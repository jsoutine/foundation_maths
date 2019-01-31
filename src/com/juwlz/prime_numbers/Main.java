package com.juwlz.prime_numbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            do {
                System.out.print("\n\nEnter a number: ");
                int n = input.nextInt();

                System.out.println("\nThe prime factors of that number are: ");

                for (int i = 2; i < n; i++) {
                    while (n % i == 0) {
                        System.out.print(i + " * ");
                        n = n / i;
                    }
                }
                if (n > 1) {
                    System.out.print(n);
                }
            } while (true);
        }
    }