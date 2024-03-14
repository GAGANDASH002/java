package java.exceptions;

class Demo2{
    public static void main(String[] args) {
        int a=19;
        int b;
        try{
            b=18/a;
            System.out.println(b);
            if(b==0){
                throw new ArithmeticException();
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero !!!");
        }
        finally{
            System.out.println("Okay Finally done");
        }
    }
    
}
