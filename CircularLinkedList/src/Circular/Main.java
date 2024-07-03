 
package Circular;

public class Main {
    public static void main(String[] args) {
       
        CircularLinkedList list = new CircularLinkedList();
        
        System.out.println("Adding elements");
        list.addAfter(0, 10);
        list.addAtStart(23);
        list.addAfter(1, 13);
        list.addAtEnd(43);
        System.out.println(list.size);
        list.print();
        System.out.println("Searching in List");
        System.out.println(list.Search(23));
        System.out.println(list.Searchat(3));
        
        list.deleteAtEnd();
        
        System.out.println("Head and tails of the list");
        System.out.println(list.head);
        System.out.println(list.tail);
        
        System.out.println("List after reversing");
        Reverse(list);
        list.print();
        
  
    }
    
     public static void Reverse(CircularLinkedList list){
        
         if (list.head==null) {
             return;
         }
         list.tail.next=null;
       Node previous = null;
       Node current = list.head;
       Node  next = current.next;
       list.tail = list.head;
       
        while (current!=null) {
            current.next = previous;
            
            if (next==null) {
                list.head = current;
                break;
            }
            
            previous = current;
            current = next;
            next = next.next;
        }
        list.tail.next=list.head;
     }    
      public static boolean IsSimilar(CircularLinkedList l1,CircularLinkedList l2){
        
        if (l1.size != l2.size) {
            return false;
        }
        else{
            Node curr1 = l1.head;
            Node curr2 = l2.head;
            
            while (curr1!=l1.tail) {                
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
      public static CircularLinkedList clone(CircularLinkedList list) {
        CircularLinkedList newList = new CircularLinkedList();
        
        Node current = list.head;
        
        while (current!=null) {            
            newList.addAtEnd(current.data);
            current=current.next;
        }
        return newList;
    }
}
