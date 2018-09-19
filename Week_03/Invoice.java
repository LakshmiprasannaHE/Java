import java.util.Scanner;
class Invoice
{
        private int item_id,item_type,item_quantity;
        private String item_name;
        private double item_price;
        public void getDetails()
        {
                System.out.println("Item-ID"+item_id);
                System.out.println("Item-Type"+item_type);
                System.out.println("Item-quantity"+item_quantity);
                System.out.println("Item-Name"+item_name);
                System.out.println("Item-Price"+item_price);
                System.out.println();
        }
        public void setDetails()
        {
                Scanner input=new Scanner(System.in);
                System.out.println("Item-ID");
                item_id=input.nextInt();
                System.out.println("Item-Type");
                item_type=input.nextInt();
                System.out.println("Item-Quantity");
                item_quantity=input.nextInt();
                input.nextLine();
                System.out.println("Item-Name");
                item_name=input.nextLine();
                System.out.println("Item-Price");
                item_price=input.nextDouble();
        }
        private double calculateTax(int item_type,double item_price)
        {
                double tax=0;
                switch(item_type){
                case 1:
                        tax=0.05*item_price;
                        break;
                case 2:
                        tax=0.12*item_price;
                        break;
                case 3:
                        tax=0.18*item_price;
                        break;
                case 4:
                        tax=0.28*item_price;
                        break;
                }
                return tax;
        }
        public void printInvoice()
        {
                Scanner input=new Scanner(System.in);
                System.out.println("calculate tax:");

                System.out.println("Item-type:");
                double tax=calculateTax(item_type,item_price);
                System.out.println("Bill:");
                getDetails();
                System.out.println("Tax"+tax);
        }
}
public class p1 {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                Invoice obj[]=new Invoice[10];
                System.out.println("Enter the number of items:");
                Scanner input=new Scanner(System.in);
                int n=input.nextInt();
                for(int i=0;i<n;i++)
                {
                        obj[i]=new Invoice();
                        obj[i].setDetails();
                }
                for(int i=0;i<n;i++)
                {
                        obj[i].printInvoice();
                }

        }

}
