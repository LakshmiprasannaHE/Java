

import java.io.IOException;

import java.io.PipedWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.IOException;
@WebServlet("/week84")
public class week84 extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		Connection con=null;
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String value=req.getParameter("value");
		String sql;
		if(value.equals("JAVA")) {
			sql="select * from student where sub1='java'";
		}
		else  {
			sql="select * from student ";
		}
		ResultSet rs=stmt.executeQuery(sql);
		PrintWriter out=resp.getWriter();
		while(rs.next()) {
			out.println(rs.getInt(1)+rs.getString(2));
		}
		}catch(ClassNotFoundException e) {e.printStackTrace();}
		catch(SQLException e) {e.printStackTrace();}
		catch (Exception e) {e.printStackTrace();}
		
	}
}
