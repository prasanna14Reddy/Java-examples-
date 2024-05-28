import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        double length = getInput("length");
        double width = getInput("width");
        
        double area = calculateArea(length, width);
        
        displayOutput(area);
    }
    
    // Function to get input from the user
    public static double getInput(String side) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the " + side + " of the rectangle: ");
        double input = scanner.nextDouble();
        return input;
    }
    
    // Function to calculate the area of the rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    
    // Function to display the output
    public static void displayOutput(double area) {
        System.out.println("The area of the rectangle is: " + area);
    }
}
