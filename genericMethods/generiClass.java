
public class generiClass <T>{

    private T x;

    public generiClass(T t){
        x = t;
    }

    public void printData(){
        System.out.println(x);
    }
}

class generiClassTest{
    public static void main(String[] args) {
        generiClass<String> a = new generiClass<String>("Java");
        a.printData();
        generiClass<Integer> b = new generiClass<Integer>(2);
        b.printData();
        generiClass<Double> c = new generiClass<Double>(3.14);
        c.printData();
    }
}