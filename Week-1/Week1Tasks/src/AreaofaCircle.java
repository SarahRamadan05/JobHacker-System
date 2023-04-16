import java.util.Scanner;

public class AreaofaCircle {
    //https://www.beecrowd.com.br/judge/en/problems/view/1002
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double pi = 3.14159;
        double A = pi * R * R;

        System.out.printf("A=%.4f%n", A);


    }

}

