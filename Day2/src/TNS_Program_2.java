
public class TNS_Program_2 
{
	
	private int empId;
	private String empName;
	private float empSal;
	public int b;
	public TNS_Program_2()
	{
		System.out.println("Default constructor invoked");
	}
	
	public String toString()
	{
		return String.format("Employee = [ %d %s %f]",empId,empName,empSal);
	}
	
	public TNS_Program_2(int empID,String empName,float empSal)
	{
		this.empId=empID;
		this.empName=empName;
		this.empSal=empSal;
	}
	
	public static void main(String [] args)
	{
		TNS_Program_2 x = new TNS_Program_2();
		System.out.println(x);
		TNS_Program_2 y = new TNS_Program_2(111,"Abhishek",5863.1f);
		System.out.println(y);
		System.out.println(y.b);
		
	}

}
