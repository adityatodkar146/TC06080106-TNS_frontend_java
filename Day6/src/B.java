
public class B extends A 
{
	B get()
	{
		return this;
	}
	
	void msg()
	{
		System.out.println("Hello B	");
	}
	
	public static void main(String [] args)
	{
		A a = new B();
		a.msg();
	}

}
