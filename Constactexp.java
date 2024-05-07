public class Constactexp
{
	int age;
	public Example9() {
		System.out.println("Default Constructor");
	}
    public Example9(int age)
    {
    	this.age=age;//"this" keyword always refer class level variable
    }
    void dis()
    {
    	System.out.println(age);
    }
	public static void main(String[] args) {

     Example9 ob1=new Example9();
     Example9 ob2=new Example9(12);
     ob1.dis();
     ob2.dis();
	}

}
