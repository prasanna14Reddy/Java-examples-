//Write a Java program to simulate a simple calculator. The program should prompt the user to enter two numbers and then ask for the operation they want to perform (addition, subtraction, multiplication, or division). Based on the user's choice, perform the corresponding operation using appropriate operators and display the result. Ensure proper error handling for division by zero and invalid operation inputs.



Example Output:

Simple Calculator

------------------

Enter first number: 10

Enter second number: 5

Choose operation (+, -, *, /): +

Result: 10 + 5 = 15

Additional Requirements:



Handle division by zero gracefully, printing an error message if the user attempts to divide by zero.

Ensure that the program loops until the user chooses to exit.

Include proper input validation to handle invalid number inputs and operation choices.
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("Simple Calculator\n------------------");

            double num1 = getValidNumber(scanner, "Enter first number: ");
            double num2 = getValidNumber(scanner, "Enter second number: ");
            char operation = getValidOperation(scanner);

            switch (operation) {
                case '+':
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            continueCalculating = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Calculator closed.");
        scanner.close();
    }

    private static double getValidNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    private static char getValidOperation(Scanner scanner) {
        while (true) {
            System.out.print("Choose operation (+, -, *, /): ");
            String input = scanner.next();
            if (input.length() == 1 && "+-*/".contains(input)) {
                return input.charAt(0);
            } else {
                System.out.println("Invalid input. Please enter a valid operation.");
            }
        }
    }
}
