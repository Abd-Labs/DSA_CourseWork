
package Queues;

import java.util.LinkedList;

public class LinkedQueue {
 
  //Nested Node class
public class Node {
    int data; 
    Node next;

    public Node(int data) {
        
        this.data = data; 
    }

    @Override
    public String toString() { 
        return "Node{\n" + "data=" + data + '}';
    }
}
  
    Node front;
    Node rear;
    int size;
    
    void print(){
        if (front==null) {
            return;
        }
        Node current = front;
        while (current!=null) {            
            System.out.print(current.data + "  ");
            current=current.next;
        }
    }
    Node front(){
        return front;
    }
    
    Node dequeue(){
        
        if (isEmpty()) {
            return null; //if Queue is empty return null
        }
         Node temp =front;
        //if Queue has only one element
        if (size==1) {
            front=null;
            rear=null;
        }
        else{
            front= front.next;
        }
      size--;
     return temp;
    }
    void enqueue(int data){
         Node node = new Node(data) ; 
         if (isEmpty()) {
             // if it is first element of the List then store its refrence in both head and tail variables
             front = node;
             rear = node;
         }
         
         else{
             // else store the address of new node in previous node's tail
             rear.next = node;
             
             //and make the node as new tail
             rear = node; 
         }
         size++;
     }
    int size(){
        return size;
     }
    
     boolean isEmpty(){
     return front==null;
     }
     
     boolean isFull(){
       return false;
     }
}
