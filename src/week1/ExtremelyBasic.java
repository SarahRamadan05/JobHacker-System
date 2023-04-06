package week1;

import java.util.Scanner;

public class ExtremelyBasic {
    //https://www.beecrowd.com.br/judge/en/problems/view/1001
    public static void main(String[] args) {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner sc = new Scanner(System.in);

        // read input values
        int A = sc.nextInt();
        int B = sc.nextInt();

        // calculate sum
        int X = A + B;

        // print result
        System.out.println("X = " + X);

        // close scanner to free resources
        sc.close();
    }

}
