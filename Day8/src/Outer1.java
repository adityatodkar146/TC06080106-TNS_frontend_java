

public class Outer1 
{
	private int i=10;
	
	class Inner
	{
		int no=111;
		public void get()
		{
			System.out.println("No = "+no);
		}
	}
	
	public static void main(String[] args) 
	{
		Outer1 o = new Outer1();
		
		Inner i = new Outer1().new Inner();
		i.get();
		
		
			
	}
}
