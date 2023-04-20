import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store :");
        n = sc.nextInt();
        int[]array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (array[i] == array[j]) {

                    for (int k = j; k < n-1; k++) {
                        array[k] = array[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }

        System.out.println("Array with unique elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


