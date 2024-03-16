package java.polymorphism;

/*Implement a class Coordinate having data members x and
y.Include appropriate constructors and void
findDistance() method. This method is used to find the
distance from origin. Two classes 2-D and 3-D are derived
from class Coordinate. Those two derived classes have
constructors and they override the void findDistance()
method. Implement an application class Demo

🡪where the distance from the origin is calculated with the
help of dynamic method dispatch.

🡪where the distance from the origin is calculated that
exhibits the run time polymorphism.*/

abstract class coordinate{//abstract class can't create object
    int x,y;
    coordinate(){
        x=0;
        y=0;
    }
    coordinate(int p ,int q){
        x=p;
        y=q;
    }
    void findDistance()
    {
        System.out.println("no shape defined");
    }
}

class twoD extends coordinate
{
    twoD()
    {
       super(); 
    }
    twoD(int x,int y){
        super(x,y);
    }
    void findDistance(){
        double dis=Math.sqrt((x*x)+(y*y));
        System.out.println("distance of two points is"+dis);

    }
}

class threeD extends coordinate{
    int z;
    threeD(){
        super();
        z=0;
    }
    threeD(int x,int y,int z){
        super(x,y);
        this.z=z;
    }
    void findDistance(){
        double dis = Math.sqrt((x*x)+(y*y)+(z*z));
        System.out.println("distance of three coordinates is"+dis);
    }
}

class apply
{
    public static void main(String[] args) {
        coordinate d = new twoD(2,3);
        coordinate e = new threeD(4,5,6);
        coordinate ptr;
        ptr=d;
        ptr.findDistance();
        ptr=e;
        ptr.findDistance();
    }
}