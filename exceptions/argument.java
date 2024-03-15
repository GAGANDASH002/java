package java.exceptions;

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
    public static void main(String y[]){
        try{
            if(y.length<4){
                throw new checkargument();
            }
        }
        catch(checkargument e){
            System.out.println(e);
        }
    }

  
}