
package DC;

public class DoublyCircular {
    Node head;
    Node tail;
    int size;
    
     void print(){
        if (head == null ) {
            System.out.println("Linked List is empty");
        }
        
        Node current = head;
        
        do {            
            System.out.println(current.data+"  ");
            current=current.next;
        }while (current!=head);
    }
    
    void addAtStart(int data){
        Node node = new Node(data);
        
        if (head==null) {
            head = node;
            tail =node;
            node.next=node;
            node.previous=node;
        }
        
        else{
            head.previous =node;
            node.next = head;
            node.previous = tail;
            tail.next=node;
            head = node;
        }
        size++;
    }
    void addAtEnd(int data){
        if (head==null) {
            addAtStart(data);
            return;
        }
        else{
            Node node = new Node(data);
            tail.next = node;
            node.previous=tail;
            head.previous=node;
            node.next=head;
            tail=node;
        }
        size++;
    }
    
    void deleteAtStart(){
        if (head==null) {
            return;
        }
        if (head.next==head) {
           head=null;
           tail=null;
        }
        else{
            head.next.previous = head.previous;
            tail.next = head.next;
            head = head.next;
        }
        size--;
    }
    void deleteAtEnd(){
        if (head==null || head.next==head) {
            deleteAtStart();
            return;
        }
        else{
            tail.previous.next = tail.next;
            head.previous = tail.previous;
            tail = tail.previous;
        }
        size--;
    }
    void addAfter(int location,int data){
        //checking if location is Valid assuming 1 based indexing
        if (location<0 || location>size) {
            System.out.println("Invalid Index");
            return ;
        }
        
        // if we are asked to add after 0th location
        if (location==0) {
            addAtStart(data); //call the add at start method
            return ;
        }
        // if the location is equal to total elements
        else if (location==size) {
            addAtEnd(data); //call the addAtend method
            return ;
        }
        else{
            Node node = new Node(data);
            Node current = head;
            int i=1;
            
            while (current!= tail) { 
                 if (i==location) {
                    node.next = current.next;
                    current.next=node;
                    node.next.previous=node;
                    node.previous=current;
                 }
                current = current.next;
                i++;
            }
        }
        size++;
    }
    void deleteAt(int location){
          //assuming 1 based indexing
        if (location<1 || location>size) {
            System.out.println("Invalid Location");
            return ;
        }  
        
        if (location ==size) {
            deleteAtEnd();
            return ;
        }
        if (location==1) {
            deleteAtStart();
            return;
        }
        else{
            int i=1;
            Node current = head;
            
            while (current!=head) {  
                if (i==(location)) {
                     current.previous.next =current.next;
                     current.next.previous =current.previous;
                }
                current=current.next;
            }
        }
        size--;
    }
    Node SearchAt(int target){
         // if target index is valid
          if (target>0 && target<=size) {
          int posFromEnd =size-target+1; // find position of target index from end
          int i;
          // if target index is closer from tail
          if (posFromEnd<target) {
              //then start searching from end of list
              Node current = tail;
              i=1;
              while (current!= head) {                  
                  if (i==posFromEnd) {
                      return current;
                  }
                  current = current.previous;
                  i++;
              }
          }
          //else search from start
          else if(target<=posFromEnd){
              Node current = head;
              i=1;
             while (current!=tail) {                 
                 if (i==target) {
                    return current;
                 }
                 current=current.next;
                 i++;
             }
          }
          
           }
          System.out.println("Invalid Index");
          return null;
    }
}

