package java;

/*Implement a class Money having data members Rupee and Paise. Include appropriate constructors and following methods
	Money add(Money)  is used to add two Money Object.
	Overload the toString() method to display Money object in  Rs.10.50paise” format.
	Write down the necessary java code to test the functionality of Money  class.
 */
class Money{
    int rupee;
    int paisa;
    Money(){
        rupee=0;
        paisa=0;
    }
    Money(int p,int q){
        rupee=p;
        paisa=q;
    }
    Money add(Money m){
        Money o=new Money();
        o.rupee=rupee+m.rupee;
        o.paisa=paisa+m.paisa;
        return o;
    }
    public String toString(){
        String s = "Rs"+rupee+"."+paisa+"paisa";
        return s;
    }
 }

 class Money_demo
 {
    public static void main(String[] args) {
        Money m = new Money(100,50);
        Money m1 = new Money(200,30);
        System.out.println("Money after add is"+m.add(m1));
        System.out.println(m.toString());
    }
 }