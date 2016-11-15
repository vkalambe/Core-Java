import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyStoreData {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/user", "root", "root");
			String query = "insert into Emp values(?,?)";
			
        
			//Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
			//ResultSet rs = stmt.executeQuery("select * from Emp");
			//rs.next();
			
			// 1 method

			/*rs.getArray(1);
			System.out.println();
            rs.updateInt(1, 007);
			rs.updateString(2, "jems");
			rs.updateRow();
			System.out.println(rs.getString(2));*/

			
			
			// 2 method
			
			/*Scanner sc = new Scanner(System.in);
			int i;
			PreparedStatement prep = conn.prepareStatement(query);
			for (i = 0; i < 2; i++) {
				prep.setInt(1, sc.nextInt());
				prep.setString(2, sc.next());
				prep.executeUpdate();
			}*/

			
			// 3 method
			Statement stmt=conn.createStatement();
			int updateRowCount=stmt.executeUpdate(query);
			DatabaseMetaData dbmd=conn.getMetaData();
			boolean queryType=stmt.execute(query);
		    System.out.println(queryType);
			
			
			
			
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
