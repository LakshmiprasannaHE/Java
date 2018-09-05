public class Armstrong
{
	public static void main(String[] args)
	{
    int n = 153;
    System.out.println("Number is: "+n);
    System.out.println(checkArmstrongNumber(n));
	}
    static boolean checkArmstrongNumber(int n){
    int a,arm=0,temp;
	temp=n;
	while(n!=0)
	{
		a=n%10;
		arm=arm+(a*a*a);
		n=n/10;
	}
	if(arm==temp)
	return true;
	else
	return false;
    }
}
