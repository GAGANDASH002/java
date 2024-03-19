package java.polymorphism;

/*Define an interface AREA having a method findArea(). Two
classes Triangle and Rectangle implement the interface and they
have their own constructors. Implement an application class
Demo where the area of both object is calculated that exhibits
run time polymorphism.*/

interface Area{
    void findArea();
}

class Triangle implements Area{
    int base , height;
    Triangle(int p,int q){
        base=p;
        height=q;
    }
    public void findArea(){
        float area=(base*height)/2;
        System.out.println("area of triangle is"+area);
    }
}   

class Rectangle implements Area{
    int length,breadth;
    Rectangle(int p,int q){
        length=p;
        breadth=q;
    }

    public void findArea(){
        float area = length*breadth;
        System.out.println("area of rectangle is"+area);
    }
}

class Area_demo{
    public static void main(String[] args) {
        Area t = new Triangle(2,3);
        Area r = new Rectangle(4,5);
        Area x;
        x=t;
        x.findArea();
        x=r;
        x.findArea();
    }
}