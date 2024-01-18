import java.sql.*;
import java.util.Scanner;
import java.util.Scanner;
public class DBdemo 
{
	public static void main(String [] args) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver found");
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TNS", "root", "Omkar@123");
        System.out.println("Established connection !!!!!");
        
        PreparedStatement pstmt = conn.prepareStatement("Insert into employee values (?,?,?)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id :- ");
        int id = sc.nextInt();
        System.out.println("Enter employee name :- ");
        String name = sc.next();
        System.out.println("Enter employee salary :- ");
        float salary = sc.nextFloat();
        
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setFloat(3, salary);
        
        int i = pstmt.executeUpdate();
        
        if(i>0)
        	System.out.println("Employee Record Sucessfully Inserted");
        else
        	System.out.println("Failed !!!");
        
        
        PreparedStatement pstmt1 = conn.prepareStatement("select * from employee");
        ResultSet rs = pstmt1.executeQuery();
        
        while(rs.next())
        {
        	System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getFloat("salary"));
        }               
    }

}
