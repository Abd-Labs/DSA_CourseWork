
package pkg;

public class LinkedList {
    
    //variables for storing head and tail
    Node head;
    int n; //total no of elements in List
    
   //we only need following methods of linked list to implement stack
    void print(){
        Node current = head;
        
        while (current!=null) {            
            System.out.println(current.data+"  ");
            
            current=current.next;
        }
        
    }
    
     boolean addAtStart(int data){
         
          Node node = new Node(data);
          
          node.next=head;
          
          head = node;
          n++;
         return true;
     }
     
   
     
       boolean DeleteAtStart(){
         n--;
        //if list has only one element
        if (n==1) {
            head=null;
            
        }
        else{
            head= head.next;
        }
       
        return true;
    }
       
    
    
    
}
 