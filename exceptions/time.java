package java.exceptions;
/* implement thre user defined exception classes hrsexception , minsexception , secexception
 * which are thrown if (hours > 24 or <0) or (minutes >60 or minutes<0) or (seconds >60 or seconds<0).
 * 
 * Implement time class with data members int hours , minutes , seconds and a method that throws the user
 * defined exceptions , also implement and application class to test its functionality.
*/

class hrsexception extends Exception{
    hrsexception(){
        super();
    }
    public String toString(){
        String x="this has hours exception";
        return x;
    }
}

class minsexception extends Exception{
    minsexception(){
        super();
    }
    public String toString(){
        String y="this has minutes exception";
        return y;
    }
}

class secexception extends Exception{
    secexception(){
        super();
    }
    public String toString(){
        String z="this has seconds exception";
        return z;
    }
}

class time{
    int hours;
    int minutes;
    int seconds;
    time(int p, int q , int r){
        hours =p;
        minutes =q;
        seconds =r;
    }
    void check() throws hrsexception,minsexception,secexception{
        if(hours>24||hours<0){
            throw new hrsexception();
        }
        else if(minutes > 60 || minutes < 0){
            throw new minsexception();
        }
        else if(seconds > 60 || seconds < 0){
            throw new secexception();
        }
        else{
           System.out.println("correct time ");
        }
    }
}

class time_demo{
    public static void main(String x[]){
        try{
        time t = new time (30,40,50);
        t.check();
        }
        catch(hrsexception h){
            System.out.println(h);
        }
        catch(minsexception m){
            System.out.println(m);
        }
        catch(secexception s){
            System.out.println(s);
        }
    }
}