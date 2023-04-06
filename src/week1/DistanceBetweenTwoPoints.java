package week1;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
  //  https://www.beecrowd.com.br/judge/en/problems/view/1015
    public static void main(String[] args)  {


        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", distance);
    }

}

