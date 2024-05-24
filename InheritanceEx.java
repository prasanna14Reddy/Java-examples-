class InheritanceEx
{
	private void a()
	{
		System.out.println("A");
	}
	protected void a1() {
		System.out.println("A1");
	}
	public void a2()
	{
		System.out.println("A2");
	}
}
class B extends A
{
	@Override
	protected void a1()
	{
		System.out.println("a1 in b");
	}
	void b()
	{
		System.out.println("B");
	}
}

public class Inher_ex {

	public static void main(String[] args) {

     B ob = new B();
     //ob.a();//private member
     ob.a1();
     ob.a2();
     ob.b();

	}

}
