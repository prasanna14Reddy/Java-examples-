abstract class Shape
{
	abstract double cal_Area();
	void display()
	{
		System.out.println("This is shape");
	}
}
class Circle extends Shape
{
	private double radius;
	public Circle(int radius)
	{
		this.radius=radius;
	}
	@Override
	double cal_Area() 
	{
		return Math.PI*radius*radius;
	}
	
}
class Rectangle extends Shape
{
	private double length,breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	double cal_Area() {
		// TODO Auto-generated method stub
		return length*breadth;
	}
	
}
public class AbstractEx {

	public static void main(String[] args) 
	{
       Circle c = new Circle(10);
       Rectangle r = new Rectangle(10, 5);
       System.out.println(c.cal_Area());
       System.out.println(r.cal_Area());
	}

}
