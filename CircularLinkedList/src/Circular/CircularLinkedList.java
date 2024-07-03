package Circular;

public class CircularLinkedList{
    
    Node head;
    Node tail;
    int size=0;
    
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
            
            if (head ==null) {
                head=node;
                tail=node;
                node.next=head;
            }
            else{
                tail.next = node;
                node.next=head;
                head = node;
            }
            size++;
        }
        void addAtEnd(int data){
           
            if (head==null) {
                addAtStart(data);
                return;
            }
             
            Node node = new Node(data);
            
            tail.next = node;
            node.next=head;
            tail=node;
            size++;
        }
        void deleteAtStart(){
            if (head==null) {
                return;
            }
            if (head.next==head) {
                head=null;
                tail = null;
            }
            else{
                tail.next = head.next;
                head = head.next;
            }
            size--;
        }
        void deleteAtEnd(){
            if (head==null) {
                return;
            }
            if (head.next==head) {
                deleteAtStart();
                return;
            }
            else{
                Node current = head;
                while (current.next!=tail) {   
                    current=current.next;
                }
                tail = current;
                tail.next = head;
            }
            size--;
        }
        void addAfter(int location,int data){
            if (location<0 || location>size) {
                System.out.println("Invalid Location ");
                return;
            }
            if (location==0) {
                addAtStart(data);
                return;
            }
            if (location==size) {
                addAtEnd(data);
                return;
            }
            Node node = new Node(data);
            if (location==1) {
                node.next = head.next;
                head.next = node;
            }
            else{
                 Node current = head.next;
                 int i=2;
                 while (current!=head) {                 
                     if (i==location) {
                        node.next=current.next;
                        current.next =node;
                     }
                     current=current.next;
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
            while (current!=tail) {
                if (i==(location-1)) {
                    current.next = current.next.next;
                }
                current = current.next;
                i++;
            }
        }
        
        
        size--;
        }
        
        //function to search if some value is present in the Linked List
        boolean Search(int value){
        if (head == null ) {
            System.out.println("Linked List is empty");
        }
            if (head.data==value) {
                return true;
            } 
        
        Node current = head.next;
         
         while (current!=head) {             
             
              if (current.data==value) {
                 return true;  //if value is found print the Node
             }
              
              current=current.next; 
         }
          return false; //if not found
        }
        
        Node Searchat(int location){
             //if value demanded at index is from 1 to n
             if (location==1) {
                return head;
            }
         if (location>0 && location<=size) {
             
             Node current = head.next;
             int i=2;
             while (current!=head) {                 
                 if (i==location) {
                    return current;
                 }
                 current=current.next;
                 i++;
             }
         }
         // if index is not valid return Null
         return null;
        }
}