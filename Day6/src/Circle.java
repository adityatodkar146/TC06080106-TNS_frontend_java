
public class Circle extends Shape
{
	private int radius;
	public Circle(int r)
	{
		radius=r;
	}
	
	@Override
	public double area() {
		return (22.0/7)*radius*radius;
	}

}
