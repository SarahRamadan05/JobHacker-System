public class DivisibleByThree {
    public static void main(String[] args) {
        divisibleByThree();
    }

    public static void divisibleByThree() {
        for (int num = 1; num <= 100; num++) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}
