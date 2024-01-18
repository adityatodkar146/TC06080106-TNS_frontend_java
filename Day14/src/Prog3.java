
public class Prog3 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent()-.getName());
		
		ThreadGroup g1 = new ThreadGroup("FirstGroup");
		System.out.println(g1.getParent().getName());
		
		ThreadGroup g2 = new ThreadGroup("SecondGroup");
		System.out.println(g2.getParent().getName());
		
	}

}
