import java.util.*;
class stack implements DataStructure{
int array[];
int stacktop;
int n;
stack(int n){
array=new int[n];
stacktop=-1;
this.n=n;
}
public void push(int ele){
if(isfull()){
System.out.println("STACK IS FULL");
}
else{
array[++stacktop]=ele;
}
}
public int pop(){
if(isempty()){return -1;}
return array[stacktop--];
}
public boolean isempty(){
if(stacktop==-1){
return true;
}return false;
}
public boolean isfull(){
if(stacktop>=n-1){return true;}return false;
}
}
class queue implements DataStructure{
int array[];
int front,rear;
int n;
queue(int n){
array=new int[n];
front=-1;
rear=-1;
this.n=n;
}
public void push(int ele){
if(isfull()){
System.out.println("Queue IS FULL");
}
else{
array[++rear]=ele;
}
}
public int pop(){
if(isempty()){return -1;}
return array[++front];
}
public boolean isempty(){
if(rear==-1){
return true;
}return false;
}
public boolean isfull(){
if(rear>=n-1){return true;}return false;
}
}
class Demo{
public static void main(String args[]){
int choice;
Scanner input=new Scanner(System.in);
System.out.println("1:stack 2:queue\n enter choice:");
choice=input.nextInt();
switch(choice){
case 1:
System.out.println("Enter the size of stack");
int n=input.nextInt();
stack s=new stack(n);
while(true)
{
System.out.println("1:push,2:pop,3:exit Enter choice: ");
choice=input.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter element");
int ele=input.nextInt();
s.push(ele);
break;
case 2:
s.pop();
break;
case 3:
System.exit(0);
}
}
case 2:
System.out.println("Enter the size of queue");
int m=input.nextInt();
queue q=new queue(m);
while(true)
{
System.out.println("1:push,2:pop,3:exit Enter choice: ");
choice=input.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter element");
int ele=input.nextInt();
q.push(ele);
break;
case 2:
q.pop();
break;
case 3:
System.exit(0);
}
}
}
}
}
