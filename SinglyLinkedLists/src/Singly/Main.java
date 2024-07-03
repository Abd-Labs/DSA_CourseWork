package Singly;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.print();

        // addAtEnd method with return type boolean Called
        if (list.addAtEnd(55)) {
            System.out.println("added at End");
        }

        if (list.addAtEnd(131)) {
            System.out.println("added at End");
        }

        if (list.addAtEnd(31)) {
            System.out.println("added at End");
        }

        if (list.addAtEnd(21)) {
            System.out.println("added at End");
        }

        //printing total elements in the List
        list.print();
        System.out.println("Total Elements in List is " + list.n);

        // Search Method with return type Node Called
        Node result = list.Search(21);
        if (result == null) {
            System.out.println("Not found");
        } else {
            System.out.println(result);
        }

        //AddAtStart method with boolean return type
        if (list.addAtStart(23)) {
            System.out.println("Added at Start");
        }
        if (list.addAtStart(133)) {
            System.out.println("Added at Start");
        }
        if (list.addAtStart(2)) {
            System.out.println("Added at Start");
        }
        if (list.addAtStart(13)) {
            System.out.println("Added at Start");
        }

        list.print();

        // SearchAt Index method with return type Node
        result = list.SearchAt(2);

        if (result == null) {
            System.out.println("Invalid Index");
        } else {
            System.out.println(result);
        }

        if (list.DeleteAtStart()) {
            System.out.println("Starting element deleted");
        }

        if (list.addAfterLocation(49, 5)) {
            System.out.println("data Added after Specified Location");
        }

        list.print();
        System.out.println("Total Elements in List is " + list.n);
        
        if (list.DeleteAt(7)) System.out.println("Data at specified Location is deleted");
        
        list.print();
        System.out.println("Total Elements in List is " + list.n);
        
        list = cloneReverse(list);
        //printing the reversed list
        System.out.println("List 1 after reversing with clone method");
        list.print();
        
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.addAtStart(3);
        list2.addAtStart(5);
        list2.addAtStart(7);
        
         list2.print();
         iterativeReverse(list2);
          System.out.println("List 2 after reversing using iterative method");
         list2.print();
         
        SinglyLinkedList list3 = new SinglyLinkedList();
        list3.addAtStart(31);
        list3.addAtStart(55);
        list3.addAtStart(72);
        
        list3.print();
        list3.head = recursiveReverse(list3.head);
        System.out.println("List 3 after reversing using recursive method");
        list3.print();

    }
    public static void iterativeReverse(SinglyLinkedList list){
        
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
    }
    
    public static Node recursiveReverse(Node pointer){
        
       
        
        if (pointer.next==null || pointer ==null ) {
           
            return pointer;
        }
        
         Node newhead=recursiveReverse(pointer.next);
        
        pointer.next.next = pointer;
        pointer.next = null;
        
        return newhead;
    }
            
    public static SinglyLinkedList cloneReverse( SinglyLinkedList list){
        
        //create a new Linked List
        SinglyLinkedList l2 = new SinglyLinkedList();
        
        // create a Node pointer 
        Node ptr = list.head;
        
        //if the List isn't already empty
        if(ptr!=null) {
            //loop through the List
            while (ptr != null) {
                //and add each element of the first  list to the start of new Linked List
                l2.addAtStart(ptr.data);
                ptr = ptr.next;
            }
            // giving the pointer of new list to First List variable
            list = l2;
            
            return list;
        }
        // if list is already empty return null
        return null;
    }
    
}
