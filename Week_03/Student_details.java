import java.util.Scanner;

class Stud
{
Scanner in=new Scanner(System.in);
String name;
int roll_no;
double subject[]=new double[4];
Stud(String n,int roll,double sub[])
{
name=n;
roll_no=roll;
subject=sub;
}
void calculateMarks()
{
double total=0;
for(int i=0;i<4;i++)
{
total+=subject[i];
}
System.out.println("Percentage : "+total/450);
}
void calculateMarks(int ex)
{
double total=0;
for(int i=0;i<4;i++)
{
total+=subject[i];
}
System.out.println("Percentage : "+(total+total*0.08)/450);
}
void calculateMarks(double ex)
{
double total=0;
for(int i=0;i<4;i++)
{
total+=subject[i];
}
System.out.println("Percentage : "+(total+total*0.045)/450);
}
}

public class StudentDetails
{
public static void main(String args[])
{
@SuppressWarnings("resource")
Scanner in=new Scanner(System.in);
String name;
int roll;
double subject[]=new double[4];
System.out.println("Enter name : ");
name=in.nextLine();
System.out.println("Enter roll : ");
roll=in.nextInt();
System.out.println("Enter subject marks : ");
for(int i=0;i<4;i++)
{
subject[i]=in.nextDouble();
}
Stud stud1=new Stud(name,roll,subject);
stud1.calculateMarks();
stud1.calculateMarks(10);
stud1.calculateMarks(4.6);
}
}
