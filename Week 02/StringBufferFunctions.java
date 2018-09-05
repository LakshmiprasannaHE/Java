public class StringBufferFunctions{
public static void main(String args[]){ 
StringBuffer s=new StringBuffer("Hello");
StringBuffer s1=new StringBuffer("Hello");
s.append("World");//demonstrates append()
System.out.println(s);
s.insert(5, "World"); //demonstrates insert()
System.out.println(s);
s.replace(5,10," "); demonstrates replace()
System.out.println(s);
s.reverse(); //demonstrates reverse()
System.out.println(s);
String s2=s1.substring(0,4);//demonstrates substring()
System.out.println(s2);
}}
