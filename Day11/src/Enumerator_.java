import java.util.*;

public class Enumerator_ 
{
	public static void main(String[] args) 
	{
		Vector <String> colors = new Vector<String>();
		String [] arr= {"Red","Green","Blue","Voilet"};
		for(String x :arr)
			colors.add(x);
		
		Enumeration x = colors.elements();
		while(x.hasMoreElements())
			System.out.println(x.nextElement());
		
		System.out.println("-----------------------------------");
		Iterator <String> x1 = colors.iterator();
		String temp=null;
		while(x1.hasNext())
		{
			temp=x1.next();
			System.out.println(temp);
			if (temp.equals("Red"))
				x1.remove();	
		}
		System.out.println(colors);
		System.out.println(colors.iterator());
		System.out.println(colors.elements());
		
		ListIterator <String> x2 = colors.listIterator();
		
		while(x2.hasNext())
		{
			temp=x2.next();
			System.out.println(temp);
			if (temp.equals("Green"))
				x2.remove();	
		}
		System.out.println(colors);
		
			
		
			
		
			
		
		
	}

}
