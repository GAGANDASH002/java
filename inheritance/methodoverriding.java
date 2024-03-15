
/*When a method in a subclass has the same name and type signature in the super class , then
 * the methood in the subclass is said to override the method of superclass. When an overriden
 * method is called by the subclass reference variable , it always invokes it own method.
 */

package java.inheritance;

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
        A a = new A(1,2);
        A b = new B(1,2,3);
        b.show();
    }
}