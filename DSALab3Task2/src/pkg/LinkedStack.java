
package pkg;

public class LinkedStack {
    static int maxSize = 10;
    LinkedList list = new LinkedList();
    
    //to check if stack is empty
    boolean isEmpty(){
        return list.head==null;
    }
    
    // to remove the top element of the stack
    void pop(){
        if (isEmpty()) {
            System.out.println("Stack is already empty");
        }
        else
        list.DeleteAtStart();
    }
    //to add new element on the top of the stack
    void push(int data){
        if (!isFull()) {
             list.addAtStart(data);
        }
        else System.err.println("Stack Overflowed");
    }
    // to get the top element of the stack
    Node top(){
        return list.head;
    }
    
    boolean isFull(){
        if (list.n==maxSize) {
           return true ;
        }
        return false;
    }
}
