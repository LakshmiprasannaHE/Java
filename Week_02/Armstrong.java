public class Armstrong
{
 public static void main(String[] args)
 {
  int number = 407;
  if(checkArmstrongNumber(number))
   System.out.println(number + " is an Armstrong number");
  else 
   System.out.println(number + " is not an Armstrong number");
 }

 static boolean checkArmstrongNumber(int num)
 {
  // Armstrong number => sum of cubes of its digits = itself
  int acc=0, digit, temp;
  for(temp=num; temp>0; )
  {
   digit = temp % 10;
   acc += digit*digit*digit;
   temp /= 10;
  }
  return acc == num; // returns true/false accordingly
 }
}
