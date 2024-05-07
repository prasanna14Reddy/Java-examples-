import java.util.Scanner;

public class AsciiValues11
 {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter a character:");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		int a=(int)ch;
		System.out.println("ASCII of "+ch+" is: "+a);
	}

}
