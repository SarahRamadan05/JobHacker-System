import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        printFibonacciNumbers(num);
    }

    public static void printFibonacciNumbers(int num) {
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1 + " " + num2);

        int num3 = num1 + num2;
        while (num3 <= num) {
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }
    }
}
