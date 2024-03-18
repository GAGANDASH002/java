package java.exceptions;

/*Implement a Stack class .This class includes appropriate
data members s and constructors and two methods

void push(int): is used to push into stack.

int pop() : is used for pop.

Implement two user defined exception classs
StackFullException and StackeEmptyException

StackFullException is associated with push and
StackeEmptyException is associated with pop.

Write down the necessary java code to test the
functionality of Stack class. */

class StackFullException extends Exception{
    StackFullException(){
        super();
    }
    public String toString(){
        String z = "sorry u cant push that element";
        return z;
    }
}

class StackEmptyException extends Exception{
    StackEmptyException(){
        super();
    }
    public String toString(){
        String s = "Nothing to pop. stack empty";
        return s;
    }
}

class stack{
    int s[];
    int tos;
    int size;
    stack(int size){
        s= new int[size];
        tos=-1;
        this.size=size;
    }

    void push(int val) throws StackFullException{
        if(tos==size-1){
            throw new StackFullException();
        }
        else{
            tos++;
            s[tos]=val;
        }
    }
    int pop() throws StackEmptyException{
        if(tos==-1){
            throw new StackEmptyException();
        }
        else{
            int val=s[tos];
            tos--;
            return val;

        }

    }
    
}

class stack_demo{
    public static void main(String[] args) {
        stack s= new stack(5);
        try{
            //pushing elements into stack
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);

            s.push(60);//trying to push element at index greater than stack size
        }
        catch(StackFullException e){
            System.out.println(e);
       }
       try {
        // Pop elements from the stack
        System.out.println("Popped element: " + s.pop());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Popped element: " + s.pop());

        // Attempting to pop from an empty stack
        System.out.println("Popped element: " + s.pop());
    } 
    catch (StackEmptyException e) {
        System.out.println(e);
    }
    finally{
        System.out.println("all tasks done ;)");
    }
    }
}