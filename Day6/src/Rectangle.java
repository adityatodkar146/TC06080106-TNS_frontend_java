
public class Rectangle extends Shape
{
	int l,b;
	
	public Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}

	public double area() {
		return l*b;
	}
	
	public static void main(String [] args)
	{
		int y =5/2;
		Shape x = new Rectangle(10,20);
		System.out.println(x.area());
		
		x=new Circle(55);
		System.out.println(0/0.0);
	}
	

}
