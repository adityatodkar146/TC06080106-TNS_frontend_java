
public class Prog5 
{


	private int empId;
	private String empName;
	
	public Prog5() {}
	
	public Prog5(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public boolean equals(Object obj) {
		Prog5 obj1 = (Prog5) obj;
		
		if(empId==obj1.empId && empName.equals(obj1.empName))
		return true;
		else
			return false;
	}
	
	public static void main(String[] args) 
	{
		Prog5 x = new Prog5(111,"Omkar");
		Prog5 y = new Prog5(111,"Omkar");
		Prog5 z = new Prog5(111,"Omkar");
		
		System.out.println(x==y);
		System.out.println(x.equals(y)+" "+y.equals(z));
		
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		
	}

	
	

	
	
	
	

}
