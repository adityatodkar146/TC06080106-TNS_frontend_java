
public class Student 
{
	private int rollno;
	private float percentage;
	
	
	public Student() {}

	public Student(int rollno, float percentage) {
		this.rollno = rollno;
		this.percentage = percentage;
	}
	
	public void show()
	{
		System.out.println("Roll no :- "+rollno);
		System.out.println("Percentage :- "+percentage);
	}
}


