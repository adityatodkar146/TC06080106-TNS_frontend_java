

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class Prog1 
{
	public static void main(String[] args) 
	{
		
		Integer x = 10;
		System.out.println(x);
		
		List <Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(30);
		
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
		
		List l1 = Collections.synchronizedList(l);
		System.out.println(l1);
		
		
	}

}
