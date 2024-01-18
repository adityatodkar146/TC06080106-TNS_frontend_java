
public class Employee 
{
	private int empNo;
	private float salary;
	static float total_salary=0.0f;
	static int no_of_employees=0;

	
	public Employee(float salary) 
	{
		this.empNo = ++no_of_employees;
		this.salary = salary;
		total_salary+=salary;
	}
	
	public static float totalSalary()
	{
		return total_salary;
	}
	
	public static void display()
	{
		System.out.println("Total n.o of employees "+no_of_employees);
		System.out.println("Total Slary = "+total_salary);
	}
	
	
	
	@Override
	public String toString() 
	{
		return "Employee [empNo=" + empNo + ", salary=" + salary + "]";
	}

	public static void main(String[] args) 
	{
		Employee x = new Employee(65874.6f);
		Employee y = new Employee(54787.5f);
		Employee z = new Employee(45875.6f);
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
		System.out.println(Employee.totalSalary());
		Employee.display();
			
	}
}
