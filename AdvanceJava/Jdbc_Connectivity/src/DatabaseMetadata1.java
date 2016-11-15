import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DatabaseMetadata1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/user", "root", "root");
			
			DatabaseMetaData dbmd=conn.getMetaData();
			//System.out.println("Driver name is "+dbmd.getDriverName());
			//System.out.println(dbmd);
			String table[]={"Emp"};
			
			ResultSet rs=dbmd.getTables(null, null, null,table);
			
			while(rs.next()){
				
				System.out.println(rs.getString(2));
				
				
				
				
			}
			conn.close();
			
			
			
			
			//System.out.println("Driver productversion is "+dbmd.getp());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
