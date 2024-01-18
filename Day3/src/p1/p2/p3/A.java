package p1.p2.p3;

public class A 
{
	private int emp_id;
	private String empName;
	private Date dt_of_joining;
	
	public A() {}
	
	public A(int emp_id, String empName, Date dt_of_joining) {
		this.emp_id = emp_id;
		this.empName = empName;
		this.dt_of_joining = dt_of_joining;
	}

	public String toString() {
		return "A [emp_id=" + emp_id + ", empName=" + empName + ", dt_of_joining=" + dt_of_joining + "]";
	}
	
	public static void main(String [] args)
	{
		A a = new A(101,"Omkar",new Date(19,10,2023));
		System.out.println(a);
		
	}

}
