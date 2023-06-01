import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangle: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the triangle: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the triangle: ");
        double side3 = scanner.nextDouble();

        System.out.print("Enter the color of the triangle: ");
        String color = scanner.next();

        System.out.print("Is the triangle filled? (true/false): ");
        boolean filled = scanner.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColorName(color);
        triangle.setFilled(filled);

        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColorName());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
