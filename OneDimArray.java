import java.util.*;

class OneDimArray
{
public static void main(String[] args)
{
int marks[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 student's marks:");
for(int i=0;i<5;i++)
{
marks[i]=sc.nextInt();
}
System.out.println("Marks of all is:");
for(int i=0;i<5;i++)
{
System.out.print(marks[i]+" ");
}
}
}
