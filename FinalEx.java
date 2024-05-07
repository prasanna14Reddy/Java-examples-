import java.util.*;
public class FinalEx {
	final int A=1;
	static final int B;
	static {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		B=sc.nextInt();
		
	}
	
   void add()
   {
	  // A++;//not possible
	   System.out.println(A+" "+B);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalEx f =new FinalEx();
		f.add();

	}

}
