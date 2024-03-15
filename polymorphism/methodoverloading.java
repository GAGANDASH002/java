package java.polymorphism;

/*Two or more methods having same name with different
parameters can be defined within a class.

Those methods are said to be overloaded and the process
is called method overloading.

Method overloading exhibits compile time polymorphism. */

class A{
    int num1,num2;
    
    void show()
    {
        System.out.println("hello from JAVA");
    }
    void show(int num1){
        System.out.println("1st number is"+num1);

    }
    void show(int num1,int num2){
        System.out.println("Both numbers of this class are:"+num1+""+num2);
    }
}

class A_demo{
    public static void main(String[] args) {
        A a = new A();
        a.show();// implements show() with no parameters
        a.show(1);// implements show() with 1 parameter
        a.show(1,2);//implements show() with 2 parameters
    }
}