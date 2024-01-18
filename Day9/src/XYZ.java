import java.util.Scanner;
public class XYZ 
{
	
	static float calc_total(Product [] arr)
	{
		float total=0;
		for(int i=0;i<arr.length;i++)
		{
			total=arr[i].getPrice()*arr[i].getQty();
		}
		return total;
	}
	
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		float price;
		int qty,pid;
		int n;
		
		System.out.println("Enter the n.o of products");
		n=sc.nextInt();
		Product [] arr = new  Product[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter pid,quantity and price of Product");
			pid=sc.nextInt();
			qty=sc.nextInt();
			price=sc.nextFloat();
			
			arr[i]=new Product(pid,price,qty);
		}
		int highest_pid=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i].getPrice() >arr[highest_pid].getPrice())
				highest_pid=arr[i].getPid();
		}
		System.out.println("Highest price pid :- "+highest_pid);
		
		System.out.println("Total cost :- "+calc_total(arr));
	}

}
