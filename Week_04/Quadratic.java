//Package
package quadraticequation;
import java.lang.Math;
public class solution {
	public static double[] roots(double a,double b,double c){
		double ro[]=new double[3];
		ro[0]=(b*b)-(4*a*c);
		ro[1]=-b/(2*a);
		ro[2]=Math.sqrt(Math.abs(ro[0]))/(2*a);
		return ro;
	}
}
//Main class
import java.util.Scanner;
import quadraticequation.*;
public class MainQuad {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a,b,c");
		double a=in.nextDouble();
		double b=in.nextDouble();
		double c=in.nextDouble();
		double sol[]=new double[3];
		sol=solution.roots(a,b,c);
		if(sol[0]==0)
		{
			System.out.println("R1=R2: "+(sol[1]+sol[2]));
		}
		else if(sol[0]>0)
		{
			System.out.println("R1: "+(sol[1]+sol[2]));
			System.out.println("R2: "+(sol[1]-sol[2]));
		}
		else
		{
			System.out.println("R1: "+sol[1]+" +i "+sol[2]);
			System.out.println("R2: "+sol[1]+" +i "+sol[2]);
		}
	}
}
