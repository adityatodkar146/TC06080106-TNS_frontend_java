import java.util.Scanner;

public class Student_1  implements StudentFee
{
	private String name;
	private float fees;
	
	public Student_1(String name) throws InvalidFeeException
	{
		this.name=name;
		getFee();
	}
	
	
	@Override
	public void getFee() throws InvalidFeeException 
	{
		System.out.println("Enter fees");
		fees = (new Scanner(System.in)).nextFloat();
		if (fees<0)
			throw new InvalidFeeException("Enter positive amount for fees");
		
		else if(fees == 0)
			throw new InvalidFeeException("Fees cannot be 0");
	}
	
	public static void main(String[] args) 
	{
		try
		{
			Student_1 x1 = new Student_1("Omkar");
			Student_1 x2 = new Student_1("Abhijeet");
			
		}
		catch(InvalidFeeException e)
		{
			System.err.println(e.getMessage());
		}
		
	}
	
	

}
