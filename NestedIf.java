import java.util.Scanner;

public class NestedIf
 {

	public static void main(String[] args) {
		int num=11;
		if(num > 10)
		{
			if(num%2==0)
			{
				System.out.println("Satisfied");
			}
			else
			{
				System.out.println("2nd condition failed");
			}
		}
		else
		{
			System.out.println("First condition failed");
		}
	}
}
