public class public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        // Handling ArrayIndexOutOfBoundsException
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println("Accessing element at index 10:");
            // This will throw ArrayIndexOutOfBoundsException
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds.");
            e.printStackTrace();
        }

        // Handling ArithmeticException
        int numerator = 10;
        int denominator = 0;

        try {
            System.out.println("Dividing " + numerator + " by " + denominator + ":");
            // This will throw ArithmeticException
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
            e.printStackTrace();
        }

        System.out.println("Program continues after exception handling.");
    }
}
public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        // Handling ArrayIndexOutOfBoundsException
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println("Accessing element at index 10:");
            // This will throw ArrayIndexOutOfBoundsException
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds.");
            e.printStackTrace();
        }

        // Handling ArithmeticException
        int numerator = 10;
        int denominator = 0;

        try {
            System.out.println("Dividing " + numerator + " by " + denominator + ":");
            // This will throw ArithmeticException
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
            e.printStackTrace();
        }

        System.out.println("Program continues after exception handling.");
    }
}
 
