
public class xyz extends Thread
{
	BankAcc x = new BankAcc();
	public void run()
	{
		x.deposit(10000.0f);
		x.deposit(10000.0f);
		x.deposit(10000.0f);
	}
	
	public static void main(String[] args) 
	{
		xyz t1 = new xyz();
		t1.run();
		
		System.out.println(t1.x.getBalance());
	}
}
