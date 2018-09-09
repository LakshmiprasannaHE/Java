public class Array
{
 public static void main(String[] args)
 {
  int[] array = new int[] {1,4,6,6,7,4,5,2,1,1,1,3,9,4,7,19,19,19,277};
  int i, j;
  in_sort(array);                   // sort to put duplicates together
  for(i=0; i<array.length-1; )
  {
   for(j=i+1; array[j]==array[i]; j++); // increment j while value same as i
   if(j-i > 1)                                  // more than 1 instance of value
    System.out.println(array[i] + " is repeated " + (j-i) + " times");
   i = j;                           // skip over all repeats
  }   
 }

 static void in_sort(int[] a) // insertion sort
 {
  int key, i=1, j;
  for(i=1; i<a.length; i++)
  {
   key = a[i];
   j = i-1;
   while(j>=0 && a[j]>key) 
   { 
    a[j+1] = a[j];
    j--;
   }  
   a[j+1] = key;
  }
 }
}
