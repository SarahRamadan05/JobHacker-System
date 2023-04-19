package week3tasks;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();
        boolean primenum = true;
        if (num <= 1) {
            primenum = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primenum = false;
                    break;
                }
            }
        }
        if (primenum) {
            System.out.println(num + " is a prime number.");

        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}

