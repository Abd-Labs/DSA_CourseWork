
package pkg;
public class ArrayStack {
    
    ARRAY array = new ARRAY();
    
 
     //to check if stack is empty
    boolean isEmpty(){
        return array.n==0;
    }
    
    // to remove the top element of the stack
    void pop(){
        if (isEmpty()) {
            System.out.println("Stack is already empty");
        }
        else
        array.removeFromEnd();
    }
    //to add new element on the top of the stack
    void push(int data){
        if (!isFull()) {
             array.addAtEnd(data);
        }
        else System.err.println("stack overflow");
    }
    // to get the top element of the stack
    int top(){
        return array.arr[array.n];
    }
     boolean isFull(){
       return array.n==array.N;
    }
}
