package java.exceptions;
/*Write an exception class named checkargument() which returns exception if the number of command line 
argumentsare less than 4. Create an application class which throws the checkargument exception if
the number of command line arguments entered are less than 4
 */

class checkargument extends Exception{
    checkargument(){
        super();
    }
    public String toString()
    {
        String x="the number of arguments are less than 4";
        return x;
    }
}

class argument{
    public static void main(String s[]){

        try{
            int w,x,y,z;
            w = Integer.parseInt(s[0]);
            x = Integer.parseInt(s[1]);
            y = Integer.parseInt(s[2]);
            z = Integer.parseInt(s[3]);
            if(s.length<4){
                throw new checkargument();
            }
        }
        catch(checkargument e){
            System.out.println(e);
        }
    }

  
}