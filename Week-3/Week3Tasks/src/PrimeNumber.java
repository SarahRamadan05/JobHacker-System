import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();
        boolean primeNumber = isPrime(num);

        if (primeNumber) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 0; i < num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
