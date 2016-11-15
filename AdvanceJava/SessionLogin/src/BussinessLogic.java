

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BussinessLogic extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter p = response.getWriter();

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/exam", "root", "root");

			String query = "select * from exam1";

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			int flag = 0;
			while (rs.next()) {

				if (name.equals(rs.getString(1))
						&& password.equals(rs.getString(2))) {
					p.print("welcome "+ " "+name);

					flag = 1;
				}
			}
			if (flag == 0) {
				p.print("username/password wrong");

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}   
	
	}

}
