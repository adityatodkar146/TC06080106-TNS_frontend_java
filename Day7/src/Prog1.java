
public class Prog1 
{
	protected void finalize() throws Throwable
	{
		System.out.println("GC");
	}
	
	public static void main(String[] args) 
	{
		Prog1 x = new Prog1();
		
		x=null;
		
		System.gc();
		
	}

}
