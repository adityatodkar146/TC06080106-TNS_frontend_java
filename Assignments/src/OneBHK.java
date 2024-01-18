
public class OneBHK 
{
	private float roomArea,hallArea;
	private long price;
	
	public OneBHK()
	{
		roomArea=0.0f;
		hallArea=0.0f;
		price=0;
	}

	public OneBHK(float roomArea, float hallArea, long price)
	{
		this.hallArea = hallArea;
		this.price = price;
		this.roomArea=roomArea;
	}
	
	public void show()
	{
		System.out.println("Room area = "+roomArea);
		System.out.println("Hall area = "+hallArea);
		System.out.println("Price = "+price);
	}
	
	public long getPrice()
	{
		return price;
	}
	

}
