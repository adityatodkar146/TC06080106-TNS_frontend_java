import java.lang.reflect.Array;

public class Exc2 
{
	public static void main(String[] args) {
		try
		{
			int a,b,c=0;
			
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			
			c=a/b;
			
			System.out.println("Div :- "+c);
		}
		catch(Exception e)
		{
			if(e instanceof ArithmeticException)
			{
				System.out.println("Denominator should no be zero");
			}
			else if(e instanceof NumberFormatException)
			{
				System.out.println("Enter only integer data");
			}
			else if(e instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println("Enter atleast two parameters");
			}
			else
			{
				System.out.println("Exception occured !!!!!!!!!");
			}
		}
		/*
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should no be zero");	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter atlest two parameters");
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Enter only integer data");
		}
		
		catch(Exception e)
		{
			/*
			System.out.println("M1 :- "+e);
			System.out.println("M2 :- "+e.getMessage());
			System.out.println("M3 :- ");
			e.printStackTrace();
			*/
		/*
			System.out.println("Exception occured!!!!!");
		}*/
	}
}
