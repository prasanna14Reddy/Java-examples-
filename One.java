class One
{
	void call()
	{
		System.out.println("One");
	}
}
class Two extends One
{
	void call()
	{
		System.out.println("Two");
	}
	void two()
	{
		System.out.println("Two Spe");
	}
}
class Three extends One
{
	void call()
	{
		System.out.println("Three");
	}
	void three()
	{
		System.out.println("three spe");
	}
}

public class HirEx {

	public static void main(String[] args) {
		
		Two t = new Two();
		t.call();
		t.two();
		Three th = new Three();
		th.call();
		th.three();

	}

}
