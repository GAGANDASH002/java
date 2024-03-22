package java.multithreading;

//extending predefined thread class

class Newthread extends Thread{
    Newthread(){
        super("child");
        System.out.println(this);
    }
    public void run(){//run method is overriden
        //child thread
        try{
            for(int i =5;i>0;i--){
            System.out.println("child"+i);
            Thread.sleep(500);
            
        }
    }
        catch(InterruptedException e){
            System.out.println("child thread interrupted");
        }
    }
}
class demo{
    public static void main(String[] args) {
        Newthread nt = new Newthread();
        nt.start();
        //main thread
        try{
            for(int i =5;i>0;i--){
                System.out.println("Main"+i);
                Thread.sleep(1000);
            }

        }
        catch(InterruptedException e){
            System.out.println("main thread interrupted");
        }
    
    }
}