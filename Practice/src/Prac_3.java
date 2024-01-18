import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
public class Prac_3 
{
	public static void main(String[] args) 
	{
		LinkedList <Student> l = new LinkedList<Student>();
		l.add(new Student(1,"Paresh",76.33));
		l.add(new Student(2,"Suresh",81.5));
		l.add(new Student(3,"Mitesh",57.3));
		l.add(new Student(4,"Rakesh",76.33));
		l.add(new Student(5,"Brijesh",57.33));
		l.add(new Student(6,"Kamlesh",66.33));
		l.add(new Student(7,"Rahul",76.33));
		l.add(new Student(8,"Birju",57.33));
		l.add(new Student(9,"Bumrahh",71.83));
		
		Comparator MyComp = new Comparator()
		{
			public int compare(Object o1, Object o2) 
			{
				Student s1 = (Student) o1;
				Student s2 = (Student) o2;
				
				if(s1.getPer() < s2.getPer())
					return 1;
				else if(s1.getPer() > s2.getPer())
					return -1;
				else
				{
					int no = s1.getName().compareTo(s2.getName());
					
					return (no>0)? 1 :-1;
				}
			}
			
		};
		
		
		
		
		for(Student x : l)
			System.out.println(x);
		
		Collections.sort(l,MyComp);
		
		System.out.println("-------------------------------------");
		
		for(Student x : l)
			System.out.println(x);
		
		
		LinkedList <Student> l2 = new LinkedList<Student>();
		l2.add(new Student(1,"Paresh",76.33));
		l2.add(new Student(2,"Suresh",81.5));
		l2.add(new Student(3,"Mitesh",57.3));
		l2.add(new Student(4,"Rakesh",76.33));
		l2.addAll(2,l);
		System.out.println(l2);
		
		
	}

}
