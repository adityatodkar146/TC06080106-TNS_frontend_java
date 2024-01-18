import java.util.Vector;
public class vector_prac 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector(10);
		
		int [] arr = {1,2,4,5,6,3,8,7,9};
		
		for(int x:arr)
			v.add(x);
		
		System.out.println(v);
		
		v.insertElementAt("Bhava", 1);
		
		System.out.println(v);
		
		v.removeElement("Bhava");
		
		System.out.println(v);
		
		v.removeElementAt(2);
		
	}

}
