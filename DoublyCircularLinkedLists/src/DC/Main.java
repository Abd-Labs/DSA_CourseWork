
package DC;

public class Main {
    public static void main(String[] args) {
        
        DoublyCircular list = new DoublyCircular();
        
        System.out.println("Adding elements");
        list.addAtEnd(23);
        list.addAtStart(11);
        list.addAfter(1,33);
        list.addAfter(2, 9);
        list.addAfter(2, 10);
        
        System.out.println(list.size);
        list.print();
        System.out.println("After Deletion");
        list.deleteAtStart();
        list.deleteAtEnd();
        list.print();
        System.out.println("Head and tail");
        System.out.println(list.head);
        System.out.println(list.tail);
        System.out.println("After reversing");
        list=reverse(list);
        list.print();
        
        DoublyCircular list2 = cloneList(list);
        
        IsSimilar(list, list2);
        
        
    }
    public static DoublyCircular reverse( DoublyCircular list){
        //reversing using cloning
          DoublyCircular l2 = new DoublyCircular();
          Node ptr = list.head;
          if(ptr!=null) {
          do {
          l2.addAtStart(ptr.data);
          ptr = ptr.next;
          }while(ptr!=list.head);
          list = l2;
          return list;
          }
          return null;
     }
     
    public static boolean IsSimilar(DoublyCircular l1,DoublyCircular l2){
        
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
    public static DoublyCircular cloneList( DoublyCircular list){
        DoublyCircular l2 = new DoublyCircular();
        Node ptr = list.head;
        if(ptr!=null) {
        do {
        l2.addAtEnd(ptr.data);
        ptr = ptr.next;
        }while(ptr!= list.head);
        list = l2;
        return list;
 }
 return null;
    }
}
