import java.util.*;
public class Encapsulation_Example
{
	private int s_Id;
	private String s_Name;
	private char s_Gen;
	private float s_Marks;
	
	/*public void get()
	{
		Scanner sc=new Scanner(System.in);
		name=sc.next();
	}
	public String pri()
	{
		return name;
	}*/
    //Getter and Setter
	
	public Encapsulation_Ex(int s_Id, String s_Name, char s_Gen, float s_Marks) {
		super();
		this.s_Id = s_Id;
		this.s_Name = s_Name;
		this.s_Gen = s_Gen;
		this.s_Marks = s_Marks;
	}
	public int getS_Id() {
		return s_Id;
	}
	public String getS_Name() {
		return s_Name;
	}
	public char getS_Gen() {
		return s_Gen;
	}
	public float getS_Marks() {
		return s_Marks;
	}



	public static void main(String[] args) {
		
		Encapsulation_Ex ob=new Encapsulation_Ex(101,"RaviTeja",'M',100);
		
		/*ob.get();
		System.out.println(ob.pri());*/
		System.out.println(ob.getS_Id()+" "+ob.getS_Name()+" "+ob.getS_Gen()+" "+ob.getS_Marks());
		
      
	}

}
