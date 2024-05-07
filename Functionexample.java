import java.util.*;
public class Functionexample
{
          int doorNo;
          String streetName;
          String town;
          String dist;
          int pincode;
          void getAddress()
          {
        	      Scanner sc = new Scanner(System.in);
				  System.out.println("Enter door num:");
				  doorNo=sc.nextInt();
				  System.out.println("Enter street name:");
				  streetName=sc.next();
				  System.out.println("Enter town:");
				  town=sc.next();
				  System.out.println("Enter district:");
				  dist=sc.next();
				  System.out.println("Enter pincode:");
				  pincode=sc.nextInt();
			}
          
          void displayAddress()
          {
        	  System.out.println(doorNo+"   "+streetName+" "+town+"  "+dist+"   "+pincode);
          }
          
	     public static void main(String[] args) 
	     {
             Example7[] ob = new Example7[2];
             for(int i=0;i<2;i++)
             {
            	 ob[i]=new Example7();
            	 ob[i].getAddress();
             }
             System.out.println("Your address is:");
       	      System.out.println("Door_Num "+" Street_Name "+" Town "+" District "+" Pincode ");
             for(int i=0;i<2;i++)
             {
            	 ob[i].displayAddress();
             }
	     }

}
