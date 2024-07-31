// pholimorphisam 
import java.util.Scanner;

public class GeometryCalculator {

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the volume of a box
    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("Geometry Calculator");
            System.out.println("1. Calculate area of a rectangle");
            System.out.println("2. Calculate area of a circle");
            System.out.println("3. Calculate volume of a box");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    double width = scanner.nextDouble();
                    double rectangleArea = calculateArea(length, width);
                    System.out.println("Area of the rectangle: " + rectangleArea);
                    break;
                case 2:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    double circleArea = calculateArea(radius);
                    System.out.println("Area of the circle: " + circleArea);
                    break;
                case 3:
                    System.out.print("Enter length of the box: ");
                    length = scanner.nextDouble();
                    System.out.print("Enter width of the box: ");
                    width = scanner.nextDouble();
                    System.out.print("Enter height of the box: ");
                    double height = scanner.nextDouble();
                    double boxVolume = calculateVolume(length, width, height);
                    System.out.println("Volume of the box: " + boxVolume);
                    break;
                case 4:
                    continueCalculating = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
            System.out.println(); // Add a blank line for better readability
        }

        System.out.println("Exiting Geometry Calculator. Goodbye!");
        scanner.close();
    }
}
