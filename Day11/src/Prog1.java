import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Prog1 
{
	public static void main(String[] args) 
	{
		LinkedList <String> l = new LinkedList <String>();
		l.add("Omkar");
		l.add("Omkar2");
		l.add("Omkar3");
		l.add("Omkar4");
		System.out.println(l);
		
		
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.add(1,"Hello");
		System.out.println(l);
		
		System.out.println(l.remove(new Integer(40)));
		
		System.out.println(l);
		
		ListIterator<String> itr = l.listIterator();
		while(itr.hasNext())
		{
			String str=itr.next();
			
			if (str.equals("Omkar"))
			{
				itr.set("abc");
			}
			if (str.equals("Omkar2"))
				itr.add("Kiran");
		}
		System.out.println(l);
		
		while (itr.hasPrevious())
		{
			if (itr.previous().equals("Omkar3"))
				itr.add("Hello");
			if (itr.previous().equals("abc"))
				itr.remove();
		}
		System.out.println(l);
		
	}
	

}
