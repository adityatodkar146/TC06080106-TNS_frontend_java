
public class Floor 
{
	private int length,breadth;

	public Floor(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public long totalTiles(Tile t)
	{
		return Math.round((length*breadth)/Math.pow(t.getLength(),2));
	}
	
	public static void main(String[] args) 
	{
		Floor x = new Floor(20,50);
		Tile t = new Tile(2);
		
		System.out.println("Total tiles :- "+x.totalTiles(t));
		
	}
	
	

}
