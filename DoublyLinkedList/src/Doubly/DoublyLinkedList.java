
package Doubly;

public class DoublyLinkedList {
    
    //Nested class for Node of a doubly linked list
    
    
    Node head;
    Node tail;
    int size=0;
    
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
  
    void addAtStart(int data){
        
        Node node = new Node(data);
        
        //if head is null make the node both head and tail
        if (head == null) {
            head = node;
            tail =node;
        }
        else{
            node.next = head;
            head.previous =node;
            head = node;
        }
        size++;
    }
    
    void addAtEnd(int data){
        //if Head is null call add at start method
        if (head==null) {
            addAtStart(data);
        }
        else{
            Node node = new Node(data);
            
            tail.next =node;
            node.previous =tail;
            tail =node;
            size++;
        }
        
    }
    
    void deleteAtStart(){
        
        if (head==null) {
            System.out.println("List is Already Empty");
        }
        //if there is only one element set head and tail equal to null
        if (head.next==null) {
            head=null;
            tail=null;
        }
        else{
            // put the node next to head into head
            head = head.next;
            head.previous = null; //and set previous of new head to null
        }
        size--;
    }
    void deleteAtEnd(){
        if (head==null || head.next==null) {
            deleteAtStart();
        }
        else{
            tail = tail.previous;
            tail.next = null;
            size--;
        }
    }
       //function to search if some value is present in the Linked List
      boolean  Search(int target){
         
           if (head == null ) {
            return false;
        }
        
        Node current = head;
        
         while (current!=null) {             
             
              if (current.data==target) {
                 return true;  //if value is found print the Node
             }
              
              current=current.next; 
         }
          return false; //if not found
     }
     
      Node Searchat(int target){
          // if target index is valid
          if (target>0 && target<=size) {
          int posFromEnd =size-target+1; // find position of target index from end
          int i;
          // if target index is closer from tail
          if (posFromEnd<target) {
              //then start searching from end of list
              Node current = tail;
              i=1;
              while (current!= null) {                  
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
             while (current!=null) {                 
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
      
      void deleteAt(int target){
          if (target<1 || target>size || head==null) {
              System.out.println("Invalid Index");
              return;
          }
          if (target==1) {
              deleteAtStart();
              return;
          }
          else if (target==size) {
              deleteAtEnd();
              return;
          }
          else{
              int posFromEnd =size-target+1; // find position of target index from end
          int i;
          // if target index is closer from tail
          if (posFromEnd<target) {
              //then start searching from end of list
              Node current = tail;
              i=1;
              while (current!= null) {                  
                  if (i==posFromEnd) {
                     current.previous.next =current.next;
                     current.next.previous =current.previous;
                  }
                  current = current.previous;
                  i++;
              }
          }
          //else search from start
          else if(target<=posFromEnd){
              Node current = head;
              i=1;
             while (current!=null) {                 
                 if (i==target) {
                     current.previous.next =current.next;
                     current.next.previous =current.previous;
                 }
                 current=current.next;
                 i++;
             }
          }
          size--;
          }
      }
      
      void addAfterLocation(int location,int data){
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
             while (current!=null) {                 
                 if (i==location) {
                    node.next = current.next;
                    current.next=node;
                    node.next.previous=node;
                    node.previous=current;
                 }
                 current=current.next;
                 i++;
             }
        }
        size++;
      }
      
}
