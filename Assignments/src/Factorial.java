
public class Factorial extends Processor 
{
	
	public Factorial(int x)
	{
		super(x);
	}

	@Override
	public void process() {
		int x=super.showData();
		int fact=1;
		
		for(int i=2;i<=x;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial :- "+fact);
	}
	
	public static void main(String[] args) 
	{
		Factorial x = new Factorial(5);
		x.process();
		
	}
}
