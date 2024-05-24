class First
{
	public void call1()
	{
		System.out.println("Call1 base");
	}
	public void call2()
	{
		System.out.println("Call2 base");
	}
}

class Second extends First
{
	public void show()
	{
		System.out.println("Show derived");
	}
	@Override
	public void call1()
	{
		super.call1();
		System.out.println("Call1 derived");
	}
}
public class RunTimePoly {

	public static void main(String[] args) {
	//	Second s = new Second();
	//	First s = new First();
	//	First s = new Second();
		Second s = (Second) new First();
		s.call1();
		s.call2();
		s.show();

	}

}
