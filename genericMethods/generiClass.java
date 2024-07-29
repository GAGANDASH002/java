import java.util.*;

public class generiClass <T>{

    private T x;

    public generiClass(T t){
        x = t;
    }

    public void printData(){
        System.out.println(x);
    }
}