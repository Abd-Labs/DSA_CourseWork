
package Doubly;

public class Main {
    public static void main(String[] args) {
       
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println("Adding Data");
       list.addAtStart(33);
       list.addAfterLocation(1, 23);
       list.addAfterLocation(1, 10);
       list.addAtStart(39);
        
        list.print();
        
        System.out.println("After deleting Data");
        list.deleteAt(3);
        list.deleteAtStart();
        System.out.println(list.size);
        list.print();
        
        System.out.println("List after reversing ");
        iterativeReverse(list);
        list.print();
        System.out.println("New list created by cloning");
        DoublyLinkedList list2 = clone(list);
        list2.print();
        System.out.println("Checking if both lists are siminlar");
        System.out.println(IsSimilar(list, list2));
        
    }
    public static void iterativeReverse(DoublyLinkedList list){
        
       Node previous = null;
       Node current = list.head;
       Node  next = current.next;
       
       
        while (current!=null) {
            current.next = previous;
            current.previous = next;
            
            if (next==null) {
                list.tail=list.head;
                list.head = current;
                break;
            }
            
            previous = current;
            current = next;
            next = next.next;
        }
    }
    public static boolean IsSimilar(DoublyLinkedList l1,DoublyLinkedList l2){
        
        if (l1.size != l2.size) {
            return false;
        }
        else{
            Node curr1 = l1.head;
            Node curr2 = l2.head;
            
            while (curr1!=null) {                
                if (curr1.data!=curr2.data) {
                    return false;
                }
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
        }
        //if code above has not returned false then return true 
        return true;
    }
    public static DoublyLinkedList clone(DoublyLinkedList list) {
        DoublyLinkedList newList = new DoublyLinkedList();
        
        Node current = list.head;
        
        while (current!=null) {            
            newList.addAtEnd(current.data);
            current=current.next;
        }
        return newList;
    }
}
