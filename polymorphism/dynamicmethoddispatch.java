package java.polymorphism;

/*In dynamic method dispatch Super class reference variable
is used to take different objects at different time */

class A{
    int x,y;
    A(int x,int y){
        this.x=x;
        this.y=y;
    }

    void show(){
        System.out.println("the data members of A class are"+x+ "" +y);
    }
}

class B extends A{
    int z;
    B(int p, int q, int r){
        super(p,q);
        z=r;
    }

    void show(){//this method overrides A class show() method
        System.out.println("z:"+z);
    }
}

class DEMO{
    public static void main(String[] args) {
        A p;//suerclass reference variable
        A a = new A(1,2);
        A b = new B(1,2,3);
        p=a;// superclass reference variable pointing to superclass object
        p.show();
        p=b;// superclass reference variable pointing to subclass object
        p.show();

    }
} 