import java.util.Vector;
import java.util.ListIterator;
import java.util.Scanner;
public class Student 
{
	private String name;
	private int roll_no,age;
	private float score;
	
	public int getRoll_no() {
		return roll_no;
	}
	
	public float getScore() {
		return score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + ", age=" + age + ", score=" + score + "]";
	}

	Student(String name, int roll_no, int age, float score) 
	{
		this.name = name;
		this.roll_no = roll_no;
		this.age = age;
		this.score = score;
	}
	public static void main(String[] args) 
	{
		Vector <Student> v = new Vector <Student>(10);
		String name;
		int roll_no,age;
		float score;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter name,roll_no,age and score of the student "+(i+1));
			name=sc.next();
			roll_no=sc.nextInt();
			age=sc.nextInt();
			score=sc.nextFloat();

			v.add(new Student(name,roll_no,age,score));
		}
		
		v.sort( new Student_comparator());
		
		ListIterator <Student> it = v.listIterator();
		
		System.out.println("0-50 score");
		while(it.hasNext())
		{
			Student x =(Student) it.next();
			if (x.getScore() <=50)
				System.out.println(x);
			else
			{
				it.previous();
				break;
			}
			
		}
		System.out.println("51-65 score");
		while(it.hasNext())
		{
			Student x =(Student) it.next();
			if (x.getScore() <=65)
				System.out.println(x);
			else
			{
				it.previous();
				break;
			}
			
		}
		
		System.out.println("66-80 score");
		while(it.hasNext())
		{
			Student x =(Student) it.next();
			if (x.getScore() <=80)
				System.out.println(x);
			else
			{
				it.previous();
				break;
			}
			
		}
		
		System.out.println("81-100 score");
		while(it.hasNext())
		{
			Student x =(Student) it.next();
			System.out.println(x);
		}
	}
	

}
