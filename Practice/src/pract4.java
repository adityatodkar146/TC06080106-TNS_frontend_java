import java.util.*;
public class pract4 
{
	public static void main(String[] args) 
	{
		ArrayList <Integer> x = new ArrayList<Integer>();
		
		x.add(10);
		x.add(20);
		x.add(1,30);
		Collections.sort(x);
		System.out.println(x);
		
		ArrayList <Student> x1 = new ArrayList<Student>();
		
		x1.add(new Student(14,"Omkar",80));
		x1.add(new Student(24,"Ram",70));
		x1.add(new Student(4,"Dhiru",85));
		System.out.println(x1);
		
		Collections.sort(x1,(s1,s2)-> Double.compare(s1.getPer(), s2.getPer()));
		System.out.println(x1);
		
		
		
		
		
	}
	

}
