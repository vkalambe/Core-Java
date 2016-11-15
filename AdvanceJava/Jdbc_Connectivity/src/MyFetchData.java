import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class MyFetchData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
			String query="select * from Emp";
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
		
			
			while(rs.next()){
				System.out.println(rs.getString(1));
				}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}







