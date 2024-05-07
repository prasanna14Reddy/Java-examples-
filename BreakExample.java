import java.util.Scanner;

public class BreakExample 
{

	public static void main(String[] args) {
     int num,i;
     boolean f = false;
     System.out.println("Enter a number to check prime or not");
     Scanner sc = new Scanner(System.in);
     num = sc.nextInt();
     for(i=2; i< num/2;++i)
     {
    	 if(num%i==0)
    	 {
    		 f=true;
    		 break;
    	 }
     }
     if(f)
     {
    	 System.out.println("Not a prime");
     }
     else
     {
    	 System.out.println("prime");
     }
	}
}
