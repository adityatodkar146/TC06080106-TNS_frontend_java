import java.sql.*;
import java.util.Scanner;
public class DBUpdate 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TNS", "root", "Omkar@123");
		PreparedStatement ps = conn.prepareStatement("UPDATE Employee set salary = ? where name = ?");
		String name;
		float salary;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name of employee");
		name=sc.next();
		System.out.println("Enter salary of employee");
		salary = sc.nextFloat();	
		
		ps.setFloat(1,salary);
		ps.setString(2,name);
		
		ps.executeUpdate();
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("Select * from employee");
		
		while(rs.next())
		{
			System.out.println(rs.getString("name")+"\t"+rs.getFloat("salary"));
		}
		
		System.out.println("Enter name of employee to be deleted");
		String name1=sc.next();
		
		PreparedStatement ps1 = conn.prepareStatement("Delete from Employee where name = ?");
		ps1.setString(1, name1);
		ps1.executeUpdate();
		
		
		rs = st.executeQuery("Select * from employee");
		
		while(rs.next())
		{
			System.out.println(rs.getString("name")+"\t"+rs.getFloat("salary"));
		}
		
		
		
		
		
	}

}
