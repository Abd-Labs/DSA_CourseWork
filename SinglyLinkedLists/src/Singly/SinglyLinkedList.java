
package Singly;

public class SinglyLinkedList {
    
    //variables for storing head and tail
    Node head;
    Node tail;
    int n; //total no of elements in List
    
    
    void print(){
        if (head == null ) {
            System.out.println("Linked List is empty");
        }
        
        Node current = head;
        
        while (current!=null) {            
            System.out.println(current.data+"  ");
            
            current=current.next;
        }
        
    }
    
     boolean  addAtEnd(int value){
         
         // create new node
          
         Node node = new Node(value) ; 
         if (head==null) {
             // if it is first element of the List then store its refrence in both head and tail variables
             head = node;
             tail = node;
         }
         
         else{
             // else store the address of new node in previous node's next
             tail.next = node;
             
             //and make the node as new tail
             tail = node; 
         }
         n++;
         return true;
     } 
     
     Node  Search(int target){
         
           if (head == null ) {
            System.out.println("Linked List is empty");
        }
        
        Node current = head;
        
         while (current!=null) {             
             
              if (current.data==target) {
                 return current;  //if value is found print the Node
             }
              
              current=current.next; 
         }
          return null; //if not found
     }
     
     boolean addAtStart(int data){
         
          Node node = new Node(data);
          
          if (head==null) {
             head=node;
             tail=node;
         }
          else{
          node.next=head;
          
          head = node;
          }
          n++;
         return true;
     }
     
     Node SearchAt(int index){
         
         //if value demanded at index is between 0 and n
         if (index>0 && index<=n) {
             
             Node current = head;
             int i=1;
             while (current!=null) {                 
                 if (i==index) {
                    return current;
                 }
                 current=current.next;
                 i++;
             }
         }
         // if index is not valid return Null
         return null;
     }
     
       boolean DeleteAtStart(){
        
        if (head==null) {
            System.out.println("List is Already Empty");
            return false; //if list is empty return false after prining
        }
         n--;
        //if list has only one element
        if (n==1) {
            head=null;
            tail=null;
        }
        else{
            head= head.next;
        }
       
        return true;
    }
    
    boolean DeleteAtEnd(){
        
       
        if (head==null) {
            System.out.println("List is Already Empty");
            return false; //if list is empty return false after prining
        }
          n--;
        //if list has only one element
        if (n==1) {
            head=null;
            tail=null;
        }
        else{
            Node current = head;
             int i=1;
             while (current!=null) {                 
                 if (i==(n-1)) {
                     //if it is second last element of List
                     current.next=null; // then make its next variable null
                    tail=current.next; // and update tail variable
                 }
                 current=current.next;
                 i++;
             }
        }
        return true;
    }
    
    Boolean DeleteAt(int location){
        //assuming 1 based indexing
        if (location<1 || location>n) {
            System.out.println("Invalid Location");
            return false;
        }
        if (head==null) {
            System.out.println("List is Already Empty");
            return false; //if list is empty return false after prining
        }
        
        
        if (location ==n) {
            DeleteAtEnd();
            return true;
        }
        n--;
        if (n==1) {
            head = null;
        }
        else {
            Node current = head;
             int i=1;
             while (current!=null) {                 
                 if (i==(location-1)) {
                   current.next = current.next.next;
                 }
                 current=current.next;
                 i++;
             }
        }
        
        return true;
    }
    Boolean addAfterLocation(int data, int location){
        
        //cchecking if location is Valid assuming 1 based indexing
        if (location<0 || location>n) {
            System.out.println("Invalid Index");
            return false;
        }
        
        // if we are asked to add after 0th location
        if (location==0) {
            addAtStart(data); //call the add at start method
            return true;
        }
        // if the location is equal to total elements
        else if (location==n) {
            addAtEnd(data); //call the addAtend method
            return true;
        }
        else{
            Node node = new Node(data);
            
            
            Node current = head;
             int i=1;
             while (current!=null) {                 
                 if (i==location) {
                    node.next=current.next;
                    current.next =node;
                 }
                 current=current.next;
                 i++;
             }
        }
        n++;
        return true;
    }
    
    
}
