
public class Player 
{
	private String Country,name;
	
	public Player()
	{
		this("Sachin");
		Country="India";
	}
	
	public Player(String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		return "Player Name = "+name+" Country Name = "+Country;
	}
	
	public static void main(String args [])
	{
		Player x = new Player();
		System.out.println(x);
	}
}
