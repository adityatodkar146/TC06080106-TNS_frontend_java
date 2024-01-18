
public class Faculty 
{
	private int faculty_id;
	private float salary;
	
	public Faculty(int faculty_id, float salary) 
	{
		this.faculty_id = faculty_id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Information \n [faculty_id=" + faculty_id + ", salary=" + salary+"  ";
	}

}
