class Maximum
{
	private int max=0;
	private int size=0;
	
	public void add(int x)
	{
		this.size++;
		if(x<=this.max)
		{
			return;
		}
		this.max=x;
	}
	public int big()
	{
		return this.max;
	}
	public int enteredNum()
	{
		return this.size;
	}
}
public class CustomWrapper {

	public static void main(String[] args) {
		Maximum m=new Maximum();
		m.add(10);
		m.add(6);
		m.add(14);
		System.out.println(m.big());
		System.out.println(m.enteredNum());
		
	}

}
