package lab_4;

import java.util.*;

interface EncryptDecrypt {
    public void Encrypt(int a, int b);
    public void Decrypt(int a, int b);
}

class Number implements EncryptDecrypt {
    int number;
    Number(int n) {
        number=n;
    }
    public void Encrypt(int a, int b) {
        int i=0,n=0,m=number;
        while(m!=0) {
            int d=m%10;
            if(a==1)
                n+=(int)(Math.pow(10, i)*((d+b)%10));
            else
                n+=(int)(Math.pow(10, i)*((10+d-b)%10));
            m=m/10;
            i++;
        }
        System.out.println(n);
    }
    public void Decrypt(int a, int b) {
        int i=0,n=0,m=number;
        while(m!=0) {
            int d=n%10;
            if(a==1)
                n+=(int)(Math.pow(10, i)*((d-b)%10));
            else
                n+=(int)(Math.pow(10, i)*((d+b)%10));
            m=m/10;
            i++;
        }
        System.out.println(n);
    }
}

class Message implements EncryptDecrypt {
    String message;
    Message(String m) {
        message=m;
    }
    public void Encrypt(int a, int b) {
        int l=message.length(),i;
        char ch;
        String msg="";
        for(i=0;i<l;i++) {
            ch=message.charAt(i);
            if(a==1)
                msg=msg+(char)((ch+b-65)%26+65);
            else if(a==2)
                msg=msg+(char)((ch-b+65)%26+65);
        }
        System.out.println(msg);
    }
    public void Decrypt(int a, int b) {
        int l=message.length(),i;
        char ch;
        String msg="";
        for(i=0;i<l;i++) {
            ch=message.charAt(i);
            if(a==1)
                msg=msg+(char)((ch-b-65)%26+65);
            else if(a==2)
                msg=msg+(char)((ch+b-65)%26+65);
        }
        System.out.println(msg);
    }
}

public class Cipher {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        Number ob1=new Number(123);
        ob1.Encrypt(1, 3);
        ob1.Encrypt(2, 3);
        Message ob2=new Message("ABC");
        ob2.Encrypt(1, 3);
        ob2.Encrypt(2, 3);
    }
}
