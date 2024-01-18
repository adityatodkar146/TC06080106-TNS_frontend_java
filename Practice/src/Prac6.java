import java.util.*;
public class Prac6 
{
	public static void main(String[] args) 
	{
		/*
		Hashtable <String,Integer> ht= new Hashtable <String,Integer>();
		ht.put("Omkar", 1);
		ht.put("xyz", 2);
		ht.put("abc", 3);
		ht.put("lmn", 4);
		ht.put("pqr", 5);
		
		System.out.println(ht);
		
		Enumeration <String> e = ht.keys();
		
		while(e.hasMoreElements())
		{
			System.out.println(ht.get(e.nextElement()));
		}
		*/
		
		/*
		
		HashSet <Student> ch1 = new HashSet<Student>();
		
		ch1.add(new Student(1,"Omkar",85.0));
		ch1.add(new Student(1,"Omkar",75.0));
		ch1.add(new Student(2,"Sarvesh",95.0));
		
		System.out.println(ch1);
		
		
		
		Iterator<Student> e1 = ch1.iterator();
		
		while(e1.hasNext())
		{
			System.out.println(e1.next());
		}
		e1=ch1.iterator();
		while(e1.hasNext())
		{
			Student s1 = (Student) e1.next();
			if(s1.getName().equals("Sarvesh"))
				e1.remove();
			
		}
		
		System.out.println(ch1);
		
		*/
		
		LinkedHashSet<Integer> lhs =new LinkedHashSet<Integer>();
		
		lhs.add(100);
		lhs.add(101);
		lhs.add(102);
		lhs.add(103);
		lhs.add(104);
		lhs.add(105);
		lhs.add(106);
		
		System.out.println(lhs);
		System.out.println(lhs.getFirst());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
