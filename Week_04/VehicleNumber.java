package VehicleNumberPlate;
import java.util.*;

public class VehicleNumber{
	
	public static void main (String args[]){
		
		System.out.println("Enter the vehicle plate number: ");
		Scanner obj1 = new Scanner(System.in);
		String s = obj1.nextLine();
		check(s);
	}
	
	public static void check(String s){
		s = s.replaceAll("\\s","");
		char[] v = s.toCharArray();
		if (Character.isLetter(v[0]) && Character.isLetter(v[1]) && Character.isLetter(v[4]) && Character.isLetter(v[5])){
			if (Character.isDigit(v[2]) && Character.isDigit(v[3]) && Character.isDigit(v[6]) && Character.isDigit(v[7]) && Character.isDigit(v[8]) && Character.isDigit(v[9])){
				System.out.println(s+" -> "+"Correct Number");
			}
		}
		else{
			System.out.println(s+" -> "+"Incorrect Number");
		}
	}
}
