import java.util.Scanner;

public class Dowhileexample {

	public static void main(String[] args) {
	  int actualPin=1234;
     int pin,count=0,amount;
     do{
        System.out.println("Enter your pin:");
        Scanner sc =new Scanner(System.in);
        pin=sc.nextInt();
        if(pin==actualPin)
            {
        	 	System.out.println("Enter amount to withdraw:");
        	 	amount=sc.nextInt();
        	 	System.out.println(amount+" withdraw successfully");
        	 	break;
            }
        else 
        {
        	count++;
        	if(count<=3)
        	{
        		System.out.println(count+" wrong attempt");
        	}
        }
       
     }while(count<3);
     if(count==3)
     {
    	 System.out.println("Your card blocked!");
     }
	}
}
