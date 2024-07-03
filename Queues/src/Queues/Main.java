
package Queues;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter 1 for simple Queue"
                + " and 2 for circular Queue ");
        int opt = in.nextInt();
        
        if (opt==1) {
            LinkedQueue q = new LinkedQueue();
            
            q.enqueue(32);
            q.enqueue(13);
            
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            
            q.enqueue(13);
            q.enqueue(45);
            q.enqueue(31);
            q.print();
        }
        else if (opt==2) {
            //creating a circular queue of size 5
            CircularQueue q = new CircularQueue(5);
            
            q.enqueue(3);
            q.enqueue(13);
            q.enqueue(33);
            q.enqueue(4);
            q.enqueue(11);
            q.print();
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            
            q.enqueue(23);
            q.enqueue(41);
            q.enqueue(71);
            q.print();
            
        }
    }
    
}
