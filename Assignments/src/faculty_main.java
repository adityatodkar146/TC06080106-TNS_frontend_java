
public class faculty_main 
{
	public static void main(String[] args) 
	{
		Faculty [] arr = new Faculty[4];
		
		arr[0]=new PartTimeFaculty(254,10,500);
		arr[1]=new FullTimeFaculty(791,25000,5000);
		arr[2]=new PartTimeFaculty(197,8,700);
		arr[3]=new FullTimeFaculty(1045,45000,15000);
		
		
		for(Faculty x :arr)
			System.out.println(x);
		
	}

}
