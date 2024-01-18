
public class TwoBHK extends OneBHK
{
	private float room2Area;

	public TwoBHK(float room1Area,float hallArea,long price,float room2Area) 
	{
		super(room1Area,hallArea,price);
		this.room2Area = room2Area;
	}
	
	public TwoBHK()
	{
		super();
		this.room2Area=0.0f;
	}
	
	public void show()
	{
		super.show();
		System.out.println("Room2 area = "+room2Area);
	}
	
	
	
	

}
