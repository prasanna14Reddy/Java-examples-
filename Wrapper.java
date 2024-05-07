public class Wrapper
 {

public static void main(String[] args) 
{
	                  //Autoboxing
byte a=1;
Byte a1=new Byte(a);
int b=6;         
Integer b1=new Integer(b);
float c=8.9f;     
Float c1=new Float(c);		
double d=67.54;  
Double d1=new Double(d);
char e='g';      
Character e1=new Character(e);		
boolean f=false;  
Boolean f1=new Boolean(f);		
System.out.println(a1+" "+b1+" "+c1+" "+d1+" "+e1+" "+f1);
Integer i1=new Integer(50);
		//unboxing
int x=i1;
System.out.println(x);
}
	
 }
