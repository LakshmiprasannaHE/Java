

import java.io.IOException;
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
@WebServlet("/validaterecord")
public class validaterecord extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","De@74qU2");
		String value1=req.getParameter("bookid");
		String value2=req.getParameter("bookname");
		String value3=req.getParameter("bookauthor");
		String value4=req.getParameter("bookedition");
		String value5=req.getParameter("bookprice");
		String sql;
		int val1=Integer.parseInt(value1);
		int val2=Integer.parseInt(value4);
		int val3=Integer.parseInt(value5);
		PreparedStatement stmt=con.prepareStatement("insert into library values(?,?,?,?,?)");
		stmt.setInt(1,val1);
		stmt.setString(2,value2);
		stmt.setString(3,value3);
		stmt.setInt(4,val2);
		stmt.setInt(5,val3);
		stmt.execute();
		}
		catch(ClassNotFoundException e) {e.printStackTrace();}
		catch(SQLException e) {e.printStackTrace();}
		catch (Exception e) {e.printStackTrace();}
	}

}
