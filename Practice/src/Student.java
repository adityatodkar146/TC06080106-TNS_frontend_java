import java.util.Objects;

public class Student 
{
	private int rollno;
	private String name;
	private double per;
	
	public Student(int rollno, String name, double per) 
	{
		this.rollno = rollno;
		this.name = name;
		this.per = per;
	}
	

	public String getName() {
		return name;
	}


	public double getPer() {
		return per;
	}
	
	public int getRollno()
	{
		return rollno;
	}
	


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", per=" + per + "]";
	}


	@Override
	public int hashCode() {
		return rollno;
	}


	@Override
	public boolean equals(Object obj) {
		return ((Student) obj).getRollno()==this.rollno;
	}	
}
