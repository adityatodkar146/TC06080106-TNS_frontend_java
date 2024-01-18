
public class Teacher extends Employee
{
	String subject;
	
	public Teacher() {}

	public Teacher(int id,String name,String subject) {
		super(id,name);
		this.subject = subject;
	}
	
	

}
