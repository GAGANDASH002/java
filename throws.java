package java;

class To_throw {
    
    To_throw() throws ArrayIndexOutOfBoundsException{
    }
    
}

class To_throw_Demo{
    public static void main(String x[]){
    try
    {
        int a[]={12};
        System.out.println(a[5]);
    }
    catch(ArrayIndexOutOfBoundsException a){
        System.out.println("That is more than the array size");
    }
}
}
