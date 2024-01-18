
public class BankAcc 
{
	private float balance;
	
	
	public BankAcc()
	{
		balance = 10000.0f;
	}

	public float getBalance() {
		return balance;
	}
	
	public void  deposit(float amt)
	{
		balance += amt;
	}
}
