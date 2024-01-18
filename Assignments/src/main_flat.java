
public class main_flat 
{
	public static void main(String[] args) 
	{
		TwoBHK [] arr = new TwoBHK[3];
		
		arr[0]=new TwoBHK(500,750,10000000,500);
		arr[1]=new TwoBHK(400,650,6500000,350);
		arr[2]=new TwoBHK(600,750,15000000,600);
		
		for(TwoBHK x :arr)
			x.show();
		long total=0;
		
		for(TwoBHK x:arr)
			total+=x.getPrice();
		
		System.out.println("Total price = "+total);
		
		
		
	}
}
