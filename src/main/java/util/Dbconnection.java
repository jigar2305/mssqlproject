package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
	static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static String url = "jdbc:sqlserver://localhost:1433;databaseName=amazon;user=sa;password=root";

	
public static void main(String[] args) 
{
	Dbconnection.getConnection();
}
	public static Connection getConnection() {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url);
		
			if(con != null) {
				System.out.println("connected...........");
			}
			System.out.println(con);
			return con;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
	


