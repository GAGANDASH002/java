class StaticGenericMethod{

    static <T> void genericPrint(T t){
        System.out.println(t.getClass().getName() + ":" + t);
    } 

    public static void main(String[] args) {
        genericPrint(101);
        genericPrint("Java");
        genericPrint(3.14);
    }
}
