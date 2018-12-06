import java.sql.*;
import java.util.*;
public class week7q2{

	public static void main(String[] args) {
		Connection con=null;
		Scanner input=new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbzuzu1","root","");
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			con.setAutoCommit(false);
			ResultSet rs;
			String sql1,sql2;
			String sql="create table college ( usn varchar (12)not null ,name varchar(255),sem int(2), cgpa double,primary key(usn))";
			stmt.executeUpdate(sql);
			sql="insert into college values('1MS16CS001','Zubin',5,9.6)";
			sql1="insert into college values('1MS16CS002','Zaid',5,8.9)";
			sql2="insert into college values('1MS16CS003','John',5,9.1)";
			stmt.executeUpdate(sql);
			stmt.executeUpdate(sql1);
			stmt.executeUpdate(sql2);
			rs=stmt.executeQuery("select * from college");
			Savepoint sp1=con.setSavepoint();
			while(rs.next()) {
				if(rs.getDouble("cgpa")<9.0)
				{
					System.out.println(" Students with less than 9 cgpa is "+rs.getString("name"));
				}
				if(rs.getString("name").equals("John")) {
					rs.updateDouble(4, 9.4);
					System.out.println(" update in table enter 0 otherwise 1");
					int yes=input.nextInt();
					if(yes==0) {
						rs.updateRow();
					}
				}
			}
			int yes;
			System.out.println("Undo the changes enter 0 otherwise 1");
			yes=input.nextInt();
			if(yes==0) {
				con.rollback(sp1);
			}
			con.releaseSavepoint(sp1);
			con.commit();
			rs=stmt.executeQuery("Select * from college");
			while(rs.next()){
				System.out.println(rs.getRow()+": "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getDouble(4));
			}
		}
		catch(ClassNotFoundException e) {e.printStackTrace();}
		catch(BatchUpdateException e) {e.printStackTrace();}
		catch(SQLException e) {e.printStackTrace();}
		catch (Exception e) {e.printStackTrace();}
		
	}
}
