public class Prog2 extends Thread
{
	
	public void run()
	{
		System.out.print(Thread.currentThread().getName()+" ");
		System.out.println(Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) 
	{
		Prog2 t1 = new Prog2();
		Prog2 t2 = new Prog2();
		Prog2 t3 = new Prog2();
		Prog2 t4 = new Prog2();
		
		
		t1.setName("One");
		t2.setName("Two");
		t3.setName("Three");
		t4.setName("Four");
		
		t1.setPriority(4);
		t2.setPriority(5);
		t3.setPriority(1);
		t4.setPriority(10);
		
		
		
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}

}
