class Superclass1 {
    Superclass() {
        System.out.println("Superclass constructor");
    }
}

class Subclass extends Superclass {
    Subclass() {
        super(); // Implicit call to superclass constructor
        System.out.println("Subclass constructor");
    }
}
super.a1();
class A
{
	String fruit="apple";
	A()
	{
		System.out.println("A cons");
	}
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
	String fruit="Orange";
	B()
	{
		super();
		System.out.println("B cons");
	}
	@Override
	protected void a1()
	{
		super.a1();//calls base class fun
		System.out.println("a1 in b");
	}
	void b()
	{
		System.out.println("B");
	}
	void dis()
	{
		System.out.println(fruit);
		System.out.println(super.fruit);
	}
}

public class Inher_ex {

	public static void main(String[] args) {

     B ob = new B();
     //ob.a();//private member
     ob.a1();
     ob.a2();
     ob.b();
    ob.dis();

	}

}
class B extends A
{
	String fruit="Orange";
	B()
	{
		super();
		System.out.println("B cons");
	}
	@Override
	protected void a1()
	{
		super.a1();//calls base class fun
		System.out.println("a1 in b");
	}
	void b()
	{
		System.out.println("B");
	}
	void dis()
	{
		System.out.println(fruit);
		System.out.println(super.fruit);
	}
}

public class Inher_ex {

	public static void main(String[] args) {

     B ob = new B();
     //ob.a();//private member
     ob.a1();
     ob.a2();
     ob.b();
    ob.dis();

	}

}
