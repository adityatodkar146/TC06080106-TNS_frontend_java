
public class Product 
{
	private int pid,qty;
	private float price;
	
	Product()
	{
		
	}
	
	Product(int pid,float price,int qty)
	{
		this.pid=pid;
		this.price=price;
		this.qty=qty;
	}
	float getPrice()
	{
		return price;
	}
	int getQty()
	{
		return qty;
	}
	int getPid()
	{
		return pid;
	}
}
