class Demo{
    // Declaring generic method
    <T> void genericPrint(T t){
        System.out.println(t);
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.genericPrint(101);// Calling method with integer argument
        obj.genericPrint("Hello World"); // Calling method with string argument
        obj.genericPrint(2.005432); // Calling method with float argument
    }
}  