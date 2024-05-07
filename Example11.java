public class Example11
{

	public static void main(String[] args) {
		
		int a[]= {1,2,3};
		for(int x:a)
		{
			System.out.println(x);
		}
		int b[][]= {{1,2},{3,4}};
		for(int x[]:b)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}
