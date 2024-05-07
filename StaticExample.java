public class StaticExample {
	//non static variable
	int a=10;
	//static variable
	static int b=5;
	static void inc()
	{
		//non static variable not accessed inside static function
		//a++;
		b++;
	}
	void ic1()
	{
		a++;
		//non static function access static and non static variable
		b++;
	}
	public static void main(String[] args) {
	  Example11 ob=new Example11();
	  Example11 ob2=new Example11();
	  System.out.println(ob.a+"  "+b);
	  //static functions can call without object
	  inc();
	  System.out.println(ob.a+"  "+b);
	  ob.ic1();
	  System.out.println(ob.a+"  "+b);
	  System.out.println(ob2.a+" "+b);
	  
	}

}
 public class Example12 {
	static int x=5;
	static {
		System.out.println(x++);
		x++;
		System.out.println(x);
	}

	public static void main(String[] args) {
		System.out.println("Main Block");
	}
