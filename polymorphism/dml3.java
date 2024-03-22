/*Implement an inter face Two_D having a method find_area()
which is used to calculate the surface area.
 Two classes CUBOID and CUBE have
implemented the interface Two_D .
Implement appropriate constructors for the above classes and
check the functionality of both classes. */

package java.polymorphism;

interface Two_D{
    void findarea();
}



class CUBOID implements Two_D{
    int length,width,height;
    CUBOID(int p,int q ,int r){
        length=p;
        width=q;
        height=r;
        
    }
    public void findarea()
    {
        float area=((2*length*width)+(2*length*height)+(2*width*height));
        System.out.println("surface area of cuboid is"+area);
    }

}

class CUBE implements Two_D{
    int side;
    CUBE(int s){
        side=s;
    }
    public void findarea(){
        float area=6*side*side;
        System.out.println("volume of cube is"+area);
    }
    
}

class APPLY{
    public static void main(String[] args) {
        Two_D c = new CUBOID(1,2,3);
        Two_D d = new CUBE(2);
        Two_D e;
        e=c;
        e.findarea();
        e=d;
        e.findarea();


    }
}