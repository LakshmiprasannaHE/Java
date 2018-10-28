class DailyTransactionLimitException extends Exception{
        DailyTransactionLimitException(String s){
                super(s);
        }
}

class InsufficientAmountException extends Exception{
        InsufficientAmountException (String s){
                super(s);
        }
}
public class atm{
        public static void main(String args[]){
                int amount=26000;
                int balance=19000;
                try{
                        if(amount>25000){
                                throw new DailyTransactionLimitException("Daily Limit Exceeded  ");
                        }
                        else if(amount>balance){
                                throw new InsufficientAmountException("Insufficient Balance");
                        }
                        else{
                                balance-=amount;
                                System.out.println("Amount withdrawn: "+amount+"  Balance: "+balance);
                        }
                }
                catch(DailyTransactionLimitException e){
                        System.out.println(e);
                }
                catch(InsufficientAmountException e){
                        System.out.println(e);
                }
        }
}
