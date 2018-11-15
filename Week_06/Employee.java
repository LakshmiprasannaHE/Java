import java.sql.*;
import java.io.*;
class insert{
public static void main(String args[])throws Exception{
    System.out.println("MySQL Connect Example.");
    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/";
    String dbName = "mydb";        //Enter your database
    String driver = "com.mysql.jdbc.Driver";
    String userName = "root";
    String password = "";
    Class.forName(driver).newInstance();
    conn = DriverManager.getConnection(url+dbName,userName,password);
    System.out.println("Connected to the database");
    String fname,lname,project;
    int id,salary;
    boolean ch=true;
PreparedStatement ps=conn.prepareStatement("insert into Employee
values(?,?,?,?,?)");
Statement stmt = conn.createStatement();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Do you want to insert: y/n");
String s=br.readLine();
if(s.startsWith("n")){
    ch=false;
}
while(ch==true){
    System.out.println("enter ID:");
    id = Integer.parseInt(br.readLine());
    System.out.println("enter Fname:");
    fname=br.readLine();
    System.out.println("enter Lname:");
    lname=br.readLine();
    System.out.println("enter project:");
    project=br.readLine();
    
    System.out.println("enter salary:");
    salary = Integer.parseInt(br.readLine());
    
    ps.setInt(1,id);
    ps.setString(2,fname);
    ps.setString(3,lname);
    ps.setString(4,project);
    ps.setInt(5,salary);
    
    int i=ps.executeUpdate();
    System.out.println(i+" records added");
    System.out.println("Do you want to continue: y/n");
    s=br.readLine();
    if(s.startsWith("n")){
        ch=false;
    }
}
String sql = "SELECT * from Employee ";
ResultSet rs = stmt.executeQuery(sql);
System.out.println("The records are :");
while (rs.next())
    {
        id = rs.getInt(1);
        fname=rs.getString(2);
        lname=rs.getString(3);
        project=rs.getString(4);
        salary=rs.getInt(5);
        
        System.out.println(rs.getRow()+"-"+id+"  "+fname + "  "+lname + "
"+project + "  "+salary);
    } //end while
sql = "SELECT * from Employee WHERE Project='web development'" ;
rs = stmt.executeQuery(sql);
System.out.println("The  are :");
while (rs.next())
    {
        id = rs.getInt(1);
        fname=rs.getString(2);
        lname=rs.getString(3);
        project=rs.getString(4);
        salary=rs.getInt(5);
        
        System.out.println(rs.getRow()+"-"+id+"  "+fname + "  "+lname + "
"+project + "  "+salary);
    } //end while
conn.close();
}}
