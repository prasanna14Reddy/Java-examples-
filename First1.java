class First
{
	protected int call1(int a)
	{
		System.out.println("Call1 base");
		return a;
	}
	public final void call2()
	{
		System.out.println("Call2 base");
	}
}

final class Second extends First
{
	public void show()
	{
		System.out.println("Show derived");
	}
	@Override
	public int call1(int x)
	{
		super.call1(x);
		System.out.println("Call1 derived");
		return x;
	}
	//not able to override
	/*public void call2()
	{
		System.out.println("Call2 in derived");
	}*/
}
public class RunTimePoly {

	public static void main(String[] args) {
		Second s = new Second();
	//	First s = new First();
	//	First s = new Second();
	//	Second s = (Second) new First();
		s.call1(4);
		s.call2();
		s.show();

	}

}
//final class cannot be inherited
/*class Third extends Second
{
	
}*/
