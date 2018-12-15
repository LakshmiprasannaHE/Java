



import java.io.IOException;

import java.io.PipedWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/displayRecord")
public class displayRecord extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","De@74qU2");
		String value1=req.getParameter("field");
		String value2=req.getParameter("name");
		String sql;
		if(value1.equals("id")) {
			sql="select * from library where id=(?)";
		}
		else {
			sql="select * from library where name=(?)";
		}
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setString(1,value2);
		ResultSet rs=stmt.executeQuery();
		PrintWriter out=resp.getWriter();
		while(rs.next()) {
			out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));
		}
		}
		catch(ClassNotFoundException e) {e.printStackTrace();}
		catch(SQLException e) {e.printStackTrace();}
		catch (Exception e) {e.printStackTrace();}
	}
}
