//Program 1
package NumberConversion;
import java.util.*;
public class A {
	Scanner input=new Scanner(System.in);
	public void dtb(){
		System.out.println("enter decimal");
		int n=input.nextInt();
		System.out.println("Binary:"+Integer.toBinaryString(n));
		
	}
	public void btd(){
		System.out.println("enter binary");
		String n=input.nextLine();
		System.out.println("Decimal:"+Integer.parseInt(n,2));
		
	}
}
//Program 2
package NumberConversion;
import java.util.*;
public class B {
	Scanner input=new Scanner(System.in);
	public void dto(){
		System.out.println("enter decimal");
		int n=input.nextInt();
		input.nextLine();
		System.out.println("Octal:"+Integer.toOctalString(n));
		
	}
	public void otd(){
		System.out.println("enter Octal");
		String n=input.nextLine();
		System.out.println("Decimal:"+Integer.parseInt(n,8));
		
	}
}
//Program 3
package NumberConversion;
import java.util.*;
public class C {
	Scanner input=new Scanner(System.in);
	public void dth(){
		System.out.println("enter decimal");
		int n=input.nextInt();
		input.nextLine();
		System.out.println("Hexa:"+Integer.toHexString(n));
		
	}
	public void htd(){
		System.out.println("enter hexa");
		String n=input.nextLine();
		System.out.println("Decimal:"+Integer.parseInt(n,16));
		
	}
}
//Main
import NumberConversion.A;
import NumberConversion.B;
import NumberConversion.C;
public class D 
{
public static void main(String args[])
{
	A obj1=new A();
	B obj2=new B();
	C obj3=new C();
	obj1.btd();
	obj1.dtb();
	obj2.dto();
	obj2.otd();
	obj3.dth();
	obj3.htd();
}
}
