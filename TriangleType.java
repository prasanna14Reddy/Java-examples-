import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Triangle Type Checker!");
        System.out.print("Please enter the length of side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Please enter the length of side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Please enter the length of side 3: ");
        double side3 = scanner.nextDouble();

        if (side1 == side2 && side2 == side3) {
            System.out.println("It's an equilateral triangle.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("It's an isosceles triangle.");
        } else {
            System.out.println("It's a scalene triangle.");
        }

        scanner.close();
    }
}
