package java.polymorphism;

/* in dynamic method lookup, Interface reference variable is
used to take different objects at
different time */

interface A{

    void show();

}

class B implements A{
    
    int x,y;
    B(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void show(){//this is an interface implemented method
        System.out.println("Sum of two numbers is:"+(x+y));
    }
}

class C implements A{
    int x,y,z;
    C(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void show(){
        System.out.println("Sum of three numbers is"+(x+y+z));
    }
}
class DEMO{
    public static void main(String[] args) {
        A p;//suerclass reference variable
        A b = new B(1,2);
        A c = new C(1,2,3);
        p=b;//interface reference variable pointing to implemeneted  object
        p.show();
        p=b;
        p.show();

    }
} 