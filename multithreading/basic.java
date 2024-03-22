package java.multithreading;

//refrencing main thread

class DeMO{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();//returns current thread details
        System.out.println("current thread "+t);
        try{
            for(int i=0;i<5;i++){
                System.out.println(i);
                Thread.sleep(1000);//thread is interrupted for one second
            }
        }
        catch(InterruptedException e){
            System.out.println("interrupted");
        }
    }
}