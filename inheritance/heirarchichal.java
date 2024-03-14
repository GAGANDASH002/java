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
        System.out.println(a+""+b);
    }
}

class C extends A{
    int c;
    C(int a ,int c)
    {
        super(a);/*super() initializes class A constructor */
        this.c=c;
    }
    void show()
    {
        System.out.println(a+""+c);
    }
}

class demo{
    public static void main(String[] args) {
        A a = new A (1);
        System.out.println("objects of class A");
        a.show();

        A b = new B(1,2);
        System.out.println("objects of class B");
        b.show(); /*subclass inherits data members and methods of superclass */

        A c = new C(2,3);
        System.out.println("objects of class C");
        c.show();
    }
}





