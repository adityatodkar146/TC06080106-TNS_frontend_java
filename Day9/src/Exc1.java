
public class Exc1 
{
	public static void fn1()
	 {
		fn2();
	 }
	
	public static void fn2()
	{
		fn3();
	}
	public static void fn3()
	{
		System.out.println(100000/0);
	}

	
	public static void main(String[] args) 
	{
		fn1();
		System.out.println("Byee");
		
	}

}
