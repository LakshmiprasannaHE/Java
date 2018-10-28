package third;
import java.util.Scanner;

class PrintingJP {
public void java() throws InterruptedException {
synchronized(this) {
while(true) {
System.out.print("Java ");
wait();
notify();
}
}
}
public void programming() throws InterruptedException {
synchronized(this) {
while(true) {
System.out.println("Programming");
notify();
wait();
}
}
}
}

public class JavaThread {
public static void main(String[] args) throws InterruptedException {
final PrintingJP obj = new PrintingJP();
Thread t1 = new Thread(new Runnable() {
@Override
public void run() {
try {
obj.java();
}
catch(InterruptedException e) {
System.out.println("Exiting Java thread.");
}
}
});
Thread t2 = new Thread(new Runnable() {
@Override
public void run() {
try {
obj.programming();
}
catch(InterruptedException e) {
System.out.println("Exiting Programming thread.");
}
}
});
t1.start();
t2.start();
t1.join();
t2.join();
}
}
