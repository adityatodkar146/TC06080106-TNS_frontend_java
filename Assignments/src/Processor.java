
public abstract class Processor
{
	private int data;
	public  int showData()
	{
		return data;
	}

	public Processor(int data)
	{
		this.data=data;
	}
	
	public abstract void process();
}
