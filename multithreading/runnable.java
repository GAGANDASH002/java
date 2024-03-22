package java.multithreading;

/*thread creation can be done in two ways:
 1. Implementing Runnable interface
 2. Extending predefined thread class
 */

 //Implementing Runnable interface

 class NewThread implements Runnable{
        Thread t;//class must have a data member of thread class
        NewThread(){
            Thread t = new Thread(this,"child");
            System.out.println(t);
        }
        public void run(){//run is a method of Runnable interface
        try{
                for(int i=0;i<5;i++){
                System.out.println(i+1);
                Thread.sleep(500);//child thread sleeps for 0.5 second
            }   
            }
        catch(InterruptedException e){
            System.out.println("child thread interrupted");
        }
    }
 }

 class Demo{
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.t.start();//starts implementing the run method
        try{
            for(int i=0;i<5;i++){
                System.out.println(i-1);
                Thread.sleep(1000);//main thread always executes after child threads
            }
        }
        catch(InterruptedException e){
            System.out.println("main thread interrupted");
        }
    }
 }