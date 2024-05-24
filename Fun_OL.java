public class Fun_OL {
     
     public Fun_OL(int a)
     {
    	 System.out.println(a);
     }
     public Fun_OL(char ch,int b)
     {
    	 System.out.println(ch+" "+b);
     }
	//data type of parameters
	/*public void show(int a)
	{
		System.out.println(a);
	}
	public void show(char ch)
	{
		System.out.println(ch);
	}*/
	//number of parameters
	/*public void dis(int a)
	{
		System.out.println(a);
	}
	public void dis(int x,int y)
	{
		System.out.println(x+y);
	}*/
	//sequence of parameter
	/*public void call(float f,char c)
	{
		System.out.println(f+" "+c);
	}
	public void call(char ch,float f1)
	{
		System.out.println(ch+" "+f1);
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Fun_OL ob=new Fun_OL(3);
     Fun_OL ob2=new Fun_OL('d',5);
    /* ob.show(7);
     ob.show('k');*/
    /* ob.dis(4);
     ob.dis(3,4);*/
     /*ob.call('a', 6.7f);
     ob.call(7.8f,'a');*/
     
	}

}
