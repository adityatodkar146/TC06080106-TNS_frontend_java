package p1.p2.p3;

public class Date 
{
	private int month,day,year;
	
	public Date() {}

	public Date(int day,int month, int year) {
		
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + "]";
	}
	
	public static void swap(Date d1,Date d2)
	{
		Date temp;
		temp=d1;
		d1=d2;
		d2=temp;
	}
	
	public static void main(String [] args)
	{
		Date d1= new Date(20,10,2023);
		Date d2 = new Date(22,10,2023);
		System.out.println(d1);
		System.out.println(d2);
		swap(d1,d2);
		System.out.println(d1);
		System.out.println(d2);
	}
}

