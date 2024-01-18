import java.util.Scanner;
public class Circle extends Processor
{

	public Circle(int r)
	{
		super(r);
	}
	
	
	public void process() 
	{
		int r=super.showData();
		System.out.println("Area = "+(float)(22/7)*r*r);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Press 1 to factorial\nPress 2 to area of circle");
		int no = new Scanner(System.in).nextInt();
		
		
		
	}
	

}
