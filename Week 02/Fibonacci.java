public class Fibonacci
{
    static int displayFibonacci(int n)
    {
    if (n <= 1)
       return n;
    return displayFibonacci(n-1) + displayFibonacci(n-2);
    }
      
    public static void main (String args[])
    {
    int n = 9;
    System.out.println("Fibonacci of "+n+" is: "+displayFibonacci(n));
    }
}
