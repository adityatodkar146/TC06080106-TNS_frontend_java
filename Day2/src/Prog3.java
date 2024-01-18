
public class Prog3 
{
	private int rollNo;
	private String name;
	private static int count;
	
	public Prog3() {}
	
	
	public Prog3(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
		count++;
	}
	
	public static int getCount()
	{
		return count;
	}
	
	public String toString()
	{
		return String.format("Student [roll No = %d Name = %s]",rollNo,name);
	}
	
	
	public static void main(String [] args)
	{
		Prog3 x = new Prog3(1101,"Omkar");
		System.out.println(x);
		System.out.println(Prog3.count);
	}
	

	static
	{
		count=50;
	}
	
}
