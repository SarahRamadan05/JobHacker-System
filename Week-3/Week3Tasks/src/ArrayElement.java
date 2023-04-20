public class ArrayElement {
    public static void main(String[] args) {
        int[] arr = new int[1000];

        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000 + 1);
        }

        int min = arr[0];
        int max = arr[0];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }


        System.out.println("Minimum value in array: " + min);
        System.out.println("Maximum value in array: " + max);
    }
}

