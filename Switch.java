import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("Enter your choice:");
		System.out.println("1.Coffee");
		System.out.println("2.Tea");
		System.out.println("3.Juice");
		int ch=new Scanner(System.in).nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Price of coffee is 20INR");
			break;
		case 2:
			System.out.println("Price of Tea is 15INR");
			break;
		case 3:
			System.out.println("Price of Juice is 40INR");
			break;
		default:
			System.out.println("Wrong entry");
		}
	}
}
