


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","blackthorne");

			String query="select empfirstname,salary,empid from Employee";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getString(2));
			}
			/*rs.absolute(3);
			rs.previous();
			rs.first();
			rs.last();
			rs.relative(-2);
			rs.isBeforeFirst();
			rs.isAfterLast();*/
			
		/*	System.out.println(rs.getString(1));
			con.close();*/
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}







