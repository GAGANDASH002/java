package java.exceptions;

class Demo{
    public static void main(String x[])
    {
        int a=20;
        int b=0;

        try{
            int div=a/b;
            System.out.println(div);
        }
        catch (ArithmeticException e){
            System.out.println("DIVISON BY ZERO NOT POSSIBLE");
        }
    }
}

