import java.util.*;
public class Encapsulation_Ex
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

	public void setS_Id(int s_Id) {
		this.s_Id = s_Id;
	}

	public String getS_Name() {
		return s_Name;
	}

	public void setS_Name(String s_Name) {
		this.s_Name = s_Name;
	}

	public char getS_Gen() {
		return s_Gen;
	}

	public void setS_Gen(char s_Gen) {
		this.s_Gen = s_Gen;
	}

	public float getS_Marks() {
		return s_Marks;
	}

	public void setS_Marks(float s_Marks) {
		this.s_Marks = s_Marks;
	}

	public static void main(String[] args) {
		
		Encapsulation_Ex ob=new Encapsulation_Ex();
		/*ob.get();
		System.out.println(ob.pri());*/
		ob.setS_Id(101);
		ob.setS_Name("Prassana");
		ob.setS_Gen('F');
		ob.setS_Marks(100);
		System.out.println(ob.getS_Id()+" "+ob.getS_Name()+" "+ob.getS_Gen()+" "+ob.getS_Marks());
      
	}

}
