import java.sql.*;
import java.util.*;
public class week7q3{

	public static void main(String[] args) {
		Connection con=null;
		Scanner input=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			con.setAutoCommit(false);
			ResultSet rs;
			String sql="create table account (account_no integer not null ,account_name varchar(255),account_type varchar(2),amount double,primary key(account_no))";
			stmt.executeUpdate(sql);
			sql="create view allrecords as select * from account";
			stmt.execute(sql);
				
			String query="insert into account values(?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1,"100987");
			pstmt.setString(2,"Ralph");
			pstmt.setString(3,"A");
			pstmt.setInt(4,98880);
			pstmt.execute();

			con.commit();
			Savepoint sp1=con.setSavepoint();
			System.out.println("Enter Amount to withdraw");
			double withdraw=input.nextInt();
			PreparedStatement pstmt1=con.prepareStatement("update account set amount=amount-? where account_name='Ralph'");
			pstmt1.setDouble(1,withdraw);
			pstmt1.executeUpdate();
			sql="select amount from account where account_name='Ralph'";
			rs=stmt.executeQuery(sql);
			rs.next();
			double balance=rs.getDouble(1);
			if(balance<1000) {
				con.rollback(sp1);
			}
			sql="delete from account where account_name='Ralph'";
			stmt.executeUpdate(sql);
			con.commit();
		}	
		catch(ClassNotFoundException e) {e.printStackTrace();}
		catch(BatchUpdateException e) {e.printStackTrace();}
		catch(SQLException e) {e.printStackTrace();}
		catch (Exception e) {e.printStackTrace();}
		
	}
}
