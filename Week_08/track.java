

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/track")
public class track extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 HttpSession session = req.getSession(true);
		 Date createTime = new Date(session.getCreationTime());
		 Date lastAccessTime = new Date(session.getLastAccessedTime());
		 String title = "Welcome Back to my website";
		 int visitCount = 0;
		 String userID;
		 if (session.isNew()){
			 title = "Welcome to my website"; 
			 session.setAttribute("userID", "ABCD");
			 } else {
			 visitCount = (Integer)session.getAttribute("visitCount"); 
			 visitCount = visitCount + 1;
			 userID = (String)session.getAttribute("userID");
			 }
			       session.setAttribute("visitCount",  visitCount);
			       resp.setContentType("text/html");
			       PrintWriter out = resp.getWriter();
			       out.println("<h1>"+title+"</h1>");
			       if(visitCount>0) {
			    	   out.println("visitCount: "+visitCount);
			       }
	}

}
