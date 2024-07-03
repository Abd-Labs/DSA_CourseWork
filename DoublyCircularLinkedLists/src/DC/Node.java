
package DC;

public class Node {
    
        Node previous;
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
        }
        
         @Override
    public String toString() { 
        return "Node{\n" + "data=" + data + '}';
    }
    
}
