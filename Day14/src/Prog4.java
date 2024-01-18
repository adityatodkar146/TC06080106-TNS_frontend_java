
public class Prog4 
{
	public static void main(String[] args) 
	{
		ThreadGroup g1 = new ThreadGroup("tg");
		Thread t1 = new Thread(g1,"ft");
		Thread t2 = new Thread(g1,"st");
		
		System.out.println(g1.getMaxPriority());
		
		g1.setMaxPriority(3);
		
		Thread t3 = new Thread(g1,"st");
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
	}

}
