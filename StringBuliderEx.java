public class StringBuliderEx{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String name="Kamatchi";
		String name1="Kamatchi";
		System.out.println(name==name1);//checks the value
	    System.out.println(name+" "+name1);
		String place=new String("AP");
		String place1=new String("AP");//false
		String place2=place;//true
		System.out.println(place==place1);//checks the address
		System.out.println(place==place2);
		System.out.println(place.equals(place1));
		char ch[]=name.toCharArray();//String to char Array
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		char a[]= {'A','N','U','D','I','P'};
	    String con=new String(a);//char array to string
		System.out.println(con);*/
		StringBuilder sb=new StringBuilder("Anudip ");
		System.out.println(sb);
		sb.append("Foundation");
		System.out.println(sb);
		sb.insert(7,"Foundation");
		System.out.println(sb);
		sb.insert(0,"Welcome to ");
		System.out.println(sb);
		sb.replace(0, 15, "Best Wishes to ");
		sb.insert(15,"Anud");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
		
	}
}
