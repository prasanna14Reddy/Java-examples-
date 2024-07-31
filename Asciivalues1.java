//3.Write a program to print ASCII value for a character

class  Asciivalues1
{
public static void main(String args[])
{
//assigning a character constant to an integer
int a='R';
int b='P';
System.out.println(a);
System.out.println(b);
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter character:");
ch=sc.next().charAt(0);
int a=(int)ch;
System.out.println("ASCII of :" + ch + " is "+a);
}
}
