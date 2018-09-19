import java.util.Scanner;
abstract class shape
{double dim1,dim2;
abstract void calculatearea();
abstract void displaydetails();
}
class rectangle extends shape
{double area;
rectangle(double x,double y)
{dim1=x;
dim2=y;
}
 void calculatearea()
 {area=dim1*dim2;

 }
 void displaydetails()
 {
         System.out.println("the dimensions are " +dim1 +dim2 +"area is:"+area);
 }
}
class triangle extends shape
{double area;
triangle(double x,double y)
{dim1=x;
dim2=y;
}
 void calculatearea()
 {area=0.5*dim1*dim2;

 }
 void displaydetails()
 {
         System.out.println("the dimensions are " +dim1 +dim2 +"area is:"+area);
 }
}
class square extends shape
{double area;
square(double x)
{dim1=x;
}
 void calculatearea()
 {area=dim1*dim1;
 }
 void displaydetails()
 {
         System.out.println("the dimensions are " +dim1 +"area is:"+area);
 }
}
public class Area {
public static void main(String args[])
{int i;
Scanner in = new Scanner(System.in);
        double x,y;
        System.out.println("enter the shape \n 1. rectangle \n 2. triangle\n 3. square \n");
        i=in.nextInt();
        switch(i)
        {
        case 1:System.out.println("enter the dimensions");
                   x=in.nextDouble();
                   y=in.nextDouble();
                   rectangle obj1 = new rectangle(x,y);
                   obj1.calculatearea();
                   obj1.displaydetails();
                   break;
        case 2:System.out.println("enter the dimensions");
               x=in.nextDouble();
               y=in.nextDouble();
               triangle obj2 = new triangle(x,y);
               obj2.calculatearea();
               obj2.displaydetails();
               break;
        case 3:System.out.println("enter the dimensions");
                   x=in.nextDouble();
                   square obj3 = new square(x);
                   obj3.calculatearea();
                   obj3.displaydetails();
                   break;
        default:System.out.println("unknown operation");
        }

}
}
