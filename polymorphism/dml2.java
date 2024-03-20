/*Design an interface PersonalLoan having a method float
find_Simple_Interrest(). Two banks Bank1
and Bank2 implements PersonalLoan to offer loan to their
customers and each bank has its own interest rate( 10% for
Bank1 and 15% for Bank2). Each bank class has it’s own static
variable named as interest_rate. Write down the necessary java
code to exhibit run time polymorphism. */

package java.polymorphism;

interface PersonalLoan{
    float find_Simple_Interrest();
}

class Bank1 implements PersonalLoan{
    int principal;
    int year;
    static float interest=0.10f;
    Bank1(int p,int y){
        principal=p;
        year=y;
       
    }
    public float find_Simple_Interrest(){
        
        float si=(principal*interest*year)/100;
        return si;
    }

}

class Bank2 implements PersonalLoan{
    int principal;
    int year;
    static float interest=0.15f;
    Bank2(int p,int y){
        principal=p;
        year=y;
        
    }
    public float find_Simple_Interrest(){
        
        float si=(principal*interest*year)/100;
        return si;
    }

}

class DeMo{
    public static void main(String[] args) {
        PersonalLoan b1= new Bank1(1000,2);
        PersonalLoan b2= new Bank2(2200,4);
        PersonalLoan p;
        p=b1;
        p.find_Simple_Interrest();
        p=b2;
        p.find_Simple_Interrest();
    }
}