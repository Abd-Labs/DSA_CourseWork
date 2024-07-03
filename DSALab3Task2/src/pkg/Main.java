
package pkg;


public class Main {
    
    public static void main(String[] args) {
        LinkedStack stack1 = new LinkedStack();
        
        ArrayStack stack2 = new ArrayStack();
        
        
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        
         System.out.println("Stack1 Top " + stack1.top());
         
         stack1.pop();
         
           System.out.println("Stack1 Top " + stack1.top());
                
        stack2.push(11);
        stack2.push(12);
        stack2.push(13);
        
        System.out.println("Stack2 Top " + stack2.top());
        
        stack2.pop();
        
        System.out.println("Stack2 Top " + stack2.top());
        
        
        
                
             
    }
}
