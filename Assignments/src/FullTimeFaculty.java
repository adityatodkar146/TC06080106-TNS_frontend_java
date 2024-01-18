
public class FullTimeFaculty extends Faculty
{
	private float basic,allowance;

	public FullTimeFaculty(int faculty_id, float basic, float allowance) 
	{
		super(faculty_id, basic+allowance);
		this.basic = basic;
		this.allowance = allowance;
	}

	@Override
	public String toString() 
	{
		return super.toString()+ "basic=" + basic + ", allowance=" + allowance +"]";
	}
}
