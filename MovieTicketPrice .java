import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Movie Ticket Price Calculator!");
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Please enter the time of the movie (in 24-hour format, e.g., 13 for 1 PM): ");
        int time = scanner.nextInt();
        
        int price;

        if (age < 5 || age >= 60) {
            price = 0; // Free ticket for children under 5 and senior citizens
        } else if (time < 12) {
            price = 250; // Matinee price
        } else if (time >= 17 && time <= 21) {
            price = 300; // Evening price
        } else {
            price = 200; // Regular price
        }

        System.out.println("The price of your movie ticket is: " + price + " dollars.");

        scanner.close();
    }
}
