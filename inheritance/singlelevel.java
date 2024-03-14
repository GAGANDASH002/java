package java.inheritance;
class A{
    int a;
    A(int a)
    {
        this.a=a;
    }
    void show()
    {
        System.out.println(a);
    }
}

class B extends A{
    int b;/*b is a data member of subclass B */
    B(int a,int b)
    {
        super(a);/*super() is used to initialize superclass constructor */
        this.b=b;
    }
    void show()
    {
        System.out.println(a+ +b);
    }
}

class demo2{
    public static void main(String[] args) {
        A a = new A (1);
        System.out.println("objects of class A");
        a.show();

        B b = new B(1,2);
        System.out.println("objects of class B");
        b.show(); /*subclass inherits data members and methods of superclass */

    } 
}


