public class StringFunctions{
public static void main(String args[]){ 
String s1="hello"; 
String s2="world";
String s3="   hello    ";
String s4="HELLO";
System.out.println("string length is: "+s1.length());  
System.out.println("string length is: "+s2.length());
System.out.println(s3.trim()+" how are you");
String replaceString=s1.replace('h','t'); 
System.out.println(replaceString);
System.out.println(s1.contains("hello"));
System.out.println(s1.contains("fine"));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1.equalsIgnoreCase(s4));
}}
