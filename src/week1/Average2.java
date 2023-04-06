package week1;

import java.util.Scanner;

public class Average2 {

//https://www.beecrowd.com.br/judge/en/problems/view/1006
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double media = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);

        System.out.println("MEDIA = " + String.format("%.1f", media));

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

    }

}

