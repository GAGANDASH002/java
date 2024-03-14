package java.exceptions;

class NoTriangleException extends Exception{
    public NoTriangleException()
    {
        super();
    }

     public String toString()
    {
       return "no triangle formed";
    }
}
class Triangle{
    
     int a,b,c;

     Triangle(int p,int q,int r) throws NoTriangleException{
        if((p+q)>r && (p+r)>q && (q+r)>p)
        {
            a=p;
            b=q;
            c=r;
        }

        else
        {
            throw new NoTriangleException();
        }
    }
}

class Triangle_demo{
    
    @SuppressWarnings("unused")
    public static void main(String x[])
    {
        try{
            Triangle t = new Triangle(1,2,3);

        }
        catch (NoTriangleException e)
        {
            System.out.println("cant form this triangle buddy");
            System.out.println(e);
        }
    }
}