
public class PartTimeFaculty extends Faculty
{
	private int hour;
	private float rate;
	
	public PartTimeFaculty(int faculty_id, int hour, float rate) {
		super(faculty_id, hour*rate);
		this.hour = hour;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return super.toString()+ "hour=" + hour + ", rate=" + rate + "]";
	}
	
	
	
	

}
