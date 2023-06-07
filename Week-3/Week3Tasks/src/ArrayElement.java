public class ArrayElement {
    public static void main(String[] args) {
        int[] arr = generateArray(1000);

        int min = findMin(arr);
        int max = findMax(arr);

        System.out.println("Minimum value in array: " + min);
        System.out.println("Maximum value in array: " + max);
    }

    public static int[] generateArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000 + 1);
        }
        return arr;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
