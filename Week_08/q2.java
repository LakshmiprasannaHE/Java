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
@WebServlet("/q2")
public class q2 extends HttpServlet {
protected void doPost(HttpServletRequest req, HttpServletResponse
resp) throws ServletException, IOException {
try {
Connection con=null;
String value4=req.getParameter("value3");
PrintWriter out=resp.getWriter();
int x = Integer.parseInt(value4.substring(6,10));
if(x>2000){
    out.println("not eligible");}
else{
        out.println("eligible");
    }
}catch (Exception e) {e.printStackTrace();}
}
}
