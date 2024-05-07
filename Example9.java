import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks:");
		marks=sc.nextInt();
		if(marks>=90)
		{
			System.out.println("You obtained Grade A");
		}
		else if(marks>=80)
		{
			System.out.println("You have obtained Grade B");
		}
		else if(marks>=60)
		{
			System.out.println("You have obtained Grade C");
		}
		else if(marks>0)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Absent");
		}
	}
}
