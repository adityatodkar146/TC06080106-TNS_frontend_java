
public class Multi_th_prgm  implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
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
	
	public static void main(String[] args) 
	{
		Multi_th_prgm x1 = new Multi_th_prgm();
		Thread t1 = new Thread(x1);
		Multi_th_prgm x2 = new Multi_th_prgm();
		Thread t2 = new Thread(x2);
		Multi_th_prgm x3 = new Multi_th_prgm();
		Thread t3 = new Thread(x3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		System.out.println("Program terminated");
		
	}
	

}
