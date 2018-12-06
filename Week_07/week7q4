import java.sql.*;
import java.util.*;
public class week7q4{

	public static void main(String[] args) {
		Connection con=null;
		Scanner input=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			con.setAutoCommit(false);
			ResultSet rs;
			String sql="create table 5sem (usn varchar(15) not null ,name varchar(255),sub1 varchar(2),sub2 varchar(2),perc integer,grade varchar(2),primary key(usn))";
			stmt.executeUpdate(sql);
			String query1="insert into 5sem values('1ms16cs001','hello','S','S',9,'S')";
			String query2="insert into 5sem values('1ms16cs002','world','A','B',8,'A')";
			String query3="insert into 5sem values('1ms16cs003','universe','S','S',9,'S')";
			String query4="insert into 5sem values('1ms16cs004','Ralph','A','A',8,'A')";
			String query5="update 5sem set sub2='S',grade='S' where usn='1ms16cs004'";
			String query6="update 5sem set sub1='A',sub2='A',grade='A' where usn='1ms16cs001'";
			stmt.addBatch(query1);
			stmt.addBatch(query2);
			stmt.addBatch(query3);
			stmt.addBatch(query4);
			stmt.addBatch(query5);
			stmt.addBatch(query6);
			int updated[]=stmt.executeBatch();
			con.commit();
			sql="select name from 5sem where sub1='S' and sub2='S'";
			rs=stmt.executeQuery(sql);
			System.out.println(" Every subject S grade");
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			sql="select name from 5sem where perc=(select min(perc) from 5sem)";
			rs=stmt.executeQuery(sql);
			System.out.println("Least Percentile");
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
		}
		catch(ClassNotFoundException e) {e.printStackTrace();}
		catch(BatchUpdateException e) {e.printStackTrace();}
		catch(SQLException e) {e.printStackTrace();}
		catch (Exception e) {e.printStackTrace();}
	}		
}
