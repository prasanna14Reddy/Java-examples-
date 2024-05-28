import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator!");
        System.out.print("Please enter your membership status (premium or non-premium): ");
        String membershipStatus = scanner.nextLine();

        System.out.print("Please enter your total purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        double discount = calculateDiscount(membershipStatus, purchaseAmount);
        
        if (discount > 0) {
            System.out.println("Congratulations! You are eligible for a " + (discount * 100) + "% discount.");
        } else {
            System.out.println("Sorry, you are not eligible for any discount.");
        }

        scanner.close();
    }
