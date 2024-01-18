
public class Voter 
{
	private int voterId,age;
	private String name;
	
	public Voter(int voterId, int age, String name) throws AgeException
	{
		this.voterId = voterId;
		this.name = name;
		if (age<18)
		{
			throw new AgeException();
		}
		else
		{
			this.age=age;
		}
	}
	
	public static void main(String[] args) 
	{
		try
		{
			Voter x1 = new Voter(1,17,"Omkar");
			System.out.println("Byee");
		}
		catch(AgeException e)
		{
			System.err.println(e.getMessage());
		}
		
	}
	
	
	

}
