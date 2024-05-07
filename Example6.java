import java.util.Scanner;
public class Example6
{

  public static void main(String[] args) {
       int a=10,b=500,c=60;
       //<,>,<=,>=,==,!=
       if(a>b)
       {
    	   if(a>c)
    	   {
    		   System.out.println("a is bigger");
    	   }
    	   else
    	   {
    		   System.out.println("c is bigger");
    	   }
       }
       else if(b>c)
       {
    	   System.out.println("b is bigger");
       }
       else
       {
    	   System.out.println("c is bigger");
       }
	}

}
