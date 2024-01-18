package exercise;
import java.util.Scanner;

public class MathOperation 
{
	private double x,y,result;
	
	void init()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos");
		x=sc.nextDouble();
		y=sc.nextDouble();
	}
	
	void add()
	{
		result=x+y;
	}
	
	void power()
	{
		result = Math.pow(x,y);
	}
	
	
	

}
