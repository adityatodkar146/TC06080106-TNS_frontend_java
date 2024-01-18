
public class MyThread extends Thread 
{
	public MyThread(ThreadGroup g , String name)
	{
		super(g,name);
	}
	
	public void run()
	{
		System.out.println("Child Thread "+Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
