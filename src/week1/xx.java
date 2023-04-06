package week1;

import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class xx {

    public static void main(String[] args)  {

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