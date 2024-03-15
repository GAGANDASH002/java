package java.exceptions;

/*implement two user defined exception classes NegativeAmountexception and
 * MinimumBalance Exception. NegativeAmount exception and MinimumBalanceexception are thrown while 
 * creating the object.Both exceptions are associated with withdrawal and only NegativeAmountexception is
 * related with deposits.[after withdrawal the balance must not be less than 2000.00]
 * Write down necessary java code to test the functionality of Account class
 * 
 * Implement an Account class having three data members name,accno,balance. This class includes
 * appropriate constructors and two methods
 * void withdraw(float cash): is used for withdawal
 * void deposite(float cash): is used for deposites
 */

 class NegativeAmountexception extends Exception{
    NegativeAmountexception(){
        super();
    }

    public String toString(){
        String z = "Negative Amount exception";
        return z;

    }

 }
 class MinimumBalanceexception extends Exception{
    MinimumBalanceexception(){
        super();
    }

    public String toString(){
        String z = "Negative Amount exception";
        return z;

    }

 }

 class Account{
        String name;
        int accno;
        double balance;

        Account()
        {
        }

        Account(String string,int q,double d){
            name =string;
            accno=q;
            balance=d;
        }

        void withdraw(double cash) throws MinimumBalanceexception,NegativeAmountexception{
            balance-=cash;
            if(balance < 2000.00){
                throw new NegativeAmountexception();
               
            }
            if(balance < 2000.00){
                throw new MinimumBalanceexception();
            }
            else{
                System.out.println("Your withdrawal is successful");
            }
    
        }

        void deposite(double cash) throws NegativeAmountexception{
            if(cash<0.0){
                throw new NegativeAmountexception();
            }
            else{
                System.out.println("Your deposit was successful :)");
            }
        }
}
 
class Account_demo{
    public static void main(String[] args) {
        try{
            Account a = new Account("Vijay",8899100,5000.00);
            a.withdraw(1000.00);
            a.deposite(1000.00);
        }
        catch(NegativeAmountexception e){
            System.out.println(e);
        }
        catch(MinimumBalanceexception s){
            System.out.println(s);
        }
    }
}
