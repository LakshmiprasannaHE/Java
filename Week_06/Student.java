package week6;

import java.sql.*;
import java.io.*;
class q4{
public static void main(String args[])throws Exception{
        System.out.println("MySQL Connect Example.");
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "question4";        //Enter your database
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url+dbName,userName,password);
        System.out.println("Connected to the database");
        String myfname,mylname;
        int myusn,sub1,sub2,sub3,sub4;
        boolean ch=true;
PreparedStatement ps=conn.prepareStatement("insert into Student values(?,?,?,?,?,?,?)");
Statement stmt = conn.createStatement();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Do you want to insert: y/n");
String s=br.readLine();
if(s.startsWith("n")){
        ch=false;
}
while(ch==true){
        System.out.println("enter ID:");
        myusn = Integer.parseInt(br.readLine());
        System.out.println("enter myfname:");
        myfname=br.readLine();
        System.out.println("enter Lname:");
        mylname=br.readLine();
        System.out.println("enter sub1 marks");
        sub1=Integer.parseInt(br.readLine());
        System.out.println("enter sub2 marks");
        sub2=Integer.parseInt(br.readLine());
        System.out.println("enter sub3 marks");
        sub3=Integer.parseInt(br.readLine());
        System.out.println("enter sub4 marks:");
        sub4 = Integer.parseInt(br.readLine());

        ps.setInt(1,myusn);
        ps.setString(2,myfname);
        ps.setString(3,mylname);
        ps.setInt(4,sub1);
        ps.setInt(5,sub2);
        ps.setInt(6,sub3);
        ps.setInt(7,sub4);
        int i=ps.executeUpdate();
        System.out.println(i+" records added");
        System.out.println("Do you want to continue: y/n");
        s=br.readLine();
        if(s.startsWith("n")){
                ch=false;
        }
}

String sql = "SELECT * from Student";
ResultSet rs = stmt.executeQuery(sql);
System.out.println("The records are :");
while (rs.next())
	{
		myusn = rs.getInt(1);
		myfname=rs.getString(2);
		mylname=rs.getString(3);
		sub1=rs.getInt(4);
		sub2=rs.getInt(5);
		sub3=rs.getInt(6);
		sub4=rs.getInt(7);
		System.out.println(rs.getRow()+"-"+myusn+"  "+myfname+"  "+mylname+"  "+sub1+"  "+sub2+"  "+sub3+"  "+sub4);
	} //end while 
sql= "SELECT USN,MAX(Sub1_Marks) from Student ";
rs = stmt.executeQuery(sql);
System.out.println("The records are :");
while (rs.next())
        {
                myusn = rs.getInt(1);
                int max_mark=rs.getInt(2);
                

                System.out.println(rs.getRow()+"-"+myusn+"  "+max_mark); 
        } //end while
sql= "SELECT USN,MAX(Sub2_Marks) from Student ";
rs = stmt.executeQuery(sql);
System.out.println("The records are :");
while (rs.next())
        {
                myusn = rs.getInt(1);
                int max_mark=rs.getInt(2);
                

                System.out.println(rs.getRow()+"-"+myusn+"  "+max_mark); 
        } //end while
sql= "SELECT USN,MAX(Sub3_Marks) from Student ";
rs = stmt.executeQuery(sql);
System.out.println("The records are :");
while (rs.next())
        {
                myusn = rs.getInt(1);
                int max_mark=rs.getInt(2);
                

                System.out.println(rs.getRow()+"-"+myusn+"  "+max_mark); 
        } //end while
sql= "SELECT USN,MAX(Sub4_Marks) from Student ";
rs = stmt.executeQuery(sql);
System.out.println("The records are :");
while (rs.next())
        {
                myusn = rs.getInt(1);
                int max_mark=rs.getInt(2);
                

                System.out.println(rs.getRow()+"-"+myusn+"  "+max_mark); 
        } 
sql= "SELECT MAX(Sub1_Marks),MIN(Sub1_Marks),AVG(Sub1_Marks) from Student ";
rs = stmt.executeQuery(sql);
System.out.println("The records are :");
while (rs.next())
        {
                myusn = rs.getInt(1);
                int max_mark=rs.getInt(2);
                int max_mark2=rs.getInt(3);
                

                System.out.println(rs.getRow()+"-"+myusn+"  "+max_mark+""+max_mark2); 
        } //end while
sql= "SELECT MAX(Sub2_Marks),MIN(Sub2_Marks),AVG(Sub2_Marks) from Student ";
rs = stmt.executeQuery(sql);
System.out.println("The records are :");
while (rs.next())
        {
                myusn = rs.getInt(1);
                int max_mark=rs.getInt(2);
                int max_mark2=rs.getInt(3);
                

                System.out.println(rs.getRow()+"-"+myusn+"  "+max_mark+""+max_mark2); 
        } //end while
sql= "SELECT MAX(Sub3_Marks),MIN(Sub3_Marks),AVG(Sub3_Marks) from Student ";
rs = stmt.executeQuery(sql);
System.out.println("The records are :");
while (rs.next())
        {
                myusn = rs.getInt(1);
                int max_mark=rs.getInt(2);
                int max_mark2=rs.getInt(3);
                

                System.out.println(rs.getRow()+"-"+myusn+"  "+max_mark+""+max_mark2); 
        } //end while
sql= "SELECT MAX(Sub4_Marks),MIN(Sub4_Marks),AVG(Sub4_Marks) from Student ";
rs = stmt.executeQuery(sql);
System.out.println("The records are :");
while (rs.next())
        {
                myusn = rs.getInt(1);
                int max_mark=rs.getInt(2);
                int max_mark2=rs.getInt(3);
                

                System.out.println(rs.getRow()+"-"+myusn+"  "+max_mark+""+max_mark2); 
        } //end while
sql= "SELECT COUNT(*) from Student where Sub1_MArks<40 ";
rs = stmt.executeQuery(sql);
System.out.println("The records are :");
while (rs.next())
        {
                myusn = rs.getInt(1);
                
                

                System.out.println(rs.getRow()+"-"+myusn); 
        } //end while

conn.close();
}}
