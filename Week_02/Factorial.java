public class Factorial {
   public static void main(String args[]){
       int n = 5;
       System.out.println("The factorial of " + n + " is " + findFactorial(n));
   }
   public static int findFactorial(int n) {
       int result = 1;
       for (int i = 1; i <= n; i++) {
           result = result * i;
       }
       return result;
   }
}
