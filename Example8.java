import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not Eligible for vote");
		}
	}

}
