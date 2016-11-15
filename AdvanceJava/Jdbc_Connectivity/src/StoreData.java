

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
			String insertQuery="insert into employee values(?,?)";
			
			//con.setAutoCommit(false);
			
			Statement stmt=con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
			
			//ResultSet rs=stmt.executeQuery("Select * from Emp");
			//rs.next();
			//rs.updateString(2, "jems");
			
			//System.out.println(rs.getString(2));
			//stmt.addBatch("insert into ....");
			//stmt.executeBatch();
			
			//rs.absolute(4);
			//rs.deleteRow();
			
			//con.commit();
/*			rs.updateInt(1, 234);
			rs.updateString(2,"New Value");
			rs.updateString(3, "New LastName");
			rs.updateInt(4, 12345);
			rs.updateRow();*/
			
/*			PreparedStatement pstmt=con.prepareStatement(insertQuery);
			Scanner sc=new Scanner(System.in);
			int id=sc.nextInt();
			pstmt.setInt(1, id);
			pstmt.setString(2, "Value Through preparestatement");
			pstmt.setString(3, "LastName");
			pstmt.setInt(4, 300000);
			pstmt.executeUpdate();
*/			
			//Statement stmt=con.createStatement();
			int updateRowCount=stmt.executeUpdate(insertQuery);
			
			DatabaseMetaData dbmd=con.getMetaData();
			
			boolean queryType=stmt.execute(insertQuery);
			System.out.println(queryType);
			
		/*	if(queryType==true)
			{
				ResultSet rs=stmt.getResultSet();
				ResultSetMetaData rsmd=rs.getMetaData();
				System.out.println(rsmd);
				rsmd.getColumnCount();
				rsmd.getColumnName(1);
			}
			else
			{
				int updateRowCount=stmt.getUpdateCount();
				
			}
			*/
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
