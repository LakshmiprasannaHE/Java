class MyThread implements Runnable 
{ 
      private int threadId; 
      private int delay; 
      MyThread(int id,int d) 
      { 
        threadId=id; 
        delay = d;//time for which thread sleeps 
      } 
      public void run() 
      { 
         for(int i=0;i<5;i++) 
            { 
                 System.out.println("Thread " + threadId +" is running"); 
                 try 
                 { 
                     Thread.sleep(delay); 
                 } 
                 catch(InterruptedException e) 
                 { 
                      e.printStackTrace(); 
                 } 
            } 
                      System.out.println("Thread " + threadId +" is Finished"); 
        } 
} 
      public class RunnableThread 
      { 
            public static void main(String[] args) 
          { 
                  System.out.println("Main thread starts"); 
                  MyThread r1 = new MyThread(1,500); 
                  MyThread r2 = new MyThread(2,300); 
                  MyThread r3 = new MyThread(3,600); 
                  Thread t1 = new Thread(r1); 
                  Thread t2 = new Thread(r2); 
                  Thread t3 = new Thread(r3); 
                  t1.start(); 
                  t2.start(); 
                  t3.start(); 
                  System.out.println("Main thread is finished"); 
          } 
      } 
