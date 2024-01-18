import java.util.Scanner;
public class Student 
{
	private int rollNo,m1,m2,m3;
	private String name;
	public int getRollNo() {
		return rollNo;
	}
	public int getM1() {
		return m1;
	}
	public int getM2() {
		return m2;
	}
	public int getM3() {
		return m3;
	}
	public String getName() {
		return name;
	}
	public Student(int rollNo, int m1, int m2, int m3, String name) {
		this.rollNo = rollNo;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.name = name;
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		Student arr [] = new Student[5];
		
		for (int i=0;i<4;i++)
		{
			int m1,m2,m3,rno;
			System.out.println("Enter roll no");
			rno=sc.nextInt();
			System.out.println("Enter name of student");
			String name = sc.next();
			System.out.println("Enter marks of students");
			
			m1=sc.nextInt();
			m2=sc.nextInt();
			m3=sc.nextInt();
			
			
			arr[i] = new Student(rno, m1, m2, m3, name);
		}
		
		for (int i=0;i<4;i++)
		{
			System.out.println("Roll no :- "+arr[i].getRollNo());
			System.out.println("Name :- "+arr[i].getName());
			
		}
	}
}
