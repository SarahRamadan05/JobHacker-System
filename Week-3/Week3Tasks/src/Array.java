import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = getUserEnteredArray();
        int[] uniqueArray = getUniqueElements(array);

        System.out.println("Array with unique elements:");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }

    public static int[] getUserEnteredArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[] getUniqueElements(int[] array) {
        int n = array.length;
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }
        int[] uniqueArray = new int[uniqueCount];
        int currentIndex = 0;
        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueArray[currentIndex] = array[i];
                currentIndex++;
            }
        }
        return uniqueArray;
    }
}
