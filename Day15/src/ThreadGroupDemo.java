
public class ThreadGroupDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ThreadGroup pg = new ThreadGroup("ParentGroup");
		ThreadGroup cg = new ThreadGroup(pg,"ChildGroup");
		
		
		MyThread t1 = new MyThread(pg,"First");
		MyThread t2 = new MyThread(pg,"Second");
		
		t1.start();
		t2.start();
		
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		
		pg.list();
		Thread.sleep(10000);
		
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		
		
		
		
	}

}
