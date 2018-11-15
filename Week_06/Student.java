import java.sql.*;  
import java.io.*;  
class JDBC_prepared_ins_ex{  
public static void main(String args[])throws Exception{  
	System.out.println("MySQL Connect Example.");
	Connection conn = null;
	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "mydb";
	String driver = "com.mysql.jdbc.Driver";
	String userName = "root"; 
	String password = "";
	Class.forName(driver).newInstance();
	conn = DriverManager.getConnection(url+dbName,userName,password);
	System.out.println("Connected to the database");
	String myusn,myfname,mylname;
	int sub1,sub2,sub3,sub4;
PreparedStatement ps=conn.prepareStatement("insert into Student values(?,?,?,?,?,?,?)");  
Statement stmt = conn.createStatement();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
do{  
	//int id=Integer.parseInt(br.readLine());
	//float salary=Float.parseFloat(br.readLine()); 
	//ps.setFloat(2, salary);
	System.out.println("enter usn:");  
	myusn=br.readLine(); 
	System.out.println("enter first name:");  
	myfname=br.readLine();
	System.out.println("enter last name:");  
	mylname=br.readLine();
	System.out.println("enter sub1 marks:");  
	sub1=Integer.parseInt(br.readLine());
	System.out.println("enter sub2 marks:");  
	sub2=Integer.parseInt(br.readLine());
	System.out.println("enter sub3 marks:");  
	sub3=Integer.parseInt(br.readLine());
	System.out.println("enter sub4 marks:");  
	sub4=Integer.parseInt(br.readLine());
	
	ps.setString(1,myusn);  
	ps.setString(2,myfname);
	ps.setString(3, mylname);
	ps.setInt(4, sub1);
	ps.setInt(5, sub2);
	ps.setInt(6, sub3);
	ps.setInt(7, sub4);
	
	int i=ps.executeUpdate();  
	System.out.println(i+" records added");  
	System.out.println("Do you want to continue: y/n");  
	String s=br.readLine();  
	if(s.startsWith("n")){  
		break;  
	}  
}while(true); 
String sql = "SELECT * from Student";
ResultSet rs = stmt.executeQuery(sql);
System.out.println("The records are :");
while (rs.next())
	{
		myusn = rs.getString(1);
		myfname=rs.getString(2);
		mylname=rs.getString(3);
		sub1=rs.getInt(4);
		sub2=rs.getInt(5);
		sub3=rs.getInt(6);
		sub4=rs.getInt(7);
		System.out.println(rs.getRow()+"-"+myusn+"  "+myfname+"  "+mylname+"  "+sub1+"  "+sub2+"  "+sub3+"  "+sub4);
	} //end while 
conn.close();  
}}  
