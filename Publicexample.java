public class Publicexample {
	int i=5;
	float f=10.5f;
	char ch='a';
	String name="Anudip";
	
	public int funA()
	{
		return i+1;
	}
    public float funB()
    {
    	return f;
    	
    }
    public char funC()
    {
    	return ch;
    }
    public String funD() 
    {
		return name;
	}
    public int add(int a,int b)
    {
    	return a+b;
    }
	public static void main(String[] args) {
		Example10 ob=new Example10();
		System.out.println(ob.funA());
		float s=ob.funB();
		System.out.println(s);
		System.out.println(ob.funC());
		System.out.println(ob.funD());
		System.out.println(ob.add(1,2));

	}

}
