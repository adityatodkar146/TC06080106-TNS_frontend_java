
public class Outer 
{
	private int no=100;
	
	protected class Inner
	{
		int no=1000;
		public void getNo()
		{
			System.out.println("No = "+no);
			System.out.println("No = "+Outer.this.no);
		}
		
	}
	
	public void get()
	{
		Inner i = new Inner();
		System.out.println("No = "+no);
	}
	
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		Inner i = o.new Inner();
		i.getNo();
		
	}

}
