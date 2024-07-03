package Queues;



public class CircularQueue {
    int[] q;
    int front;
    int rear;
    int N;
    int n;
    //constructor
    CircularQueue(int Size){
         N=Size;
         q=new int[N];
         front=rear=-1;
      }

    void print(){  
            if (isempty()) {
                return;
            }
            if(rear >= front){
     
              // Loop to print elements from
              // front to rear.
              for(int i = front; i <= rear; i++)
              {
                  System.out.print(q[i]+"  ");
              }
           } // If rear crossed the max index and
    // indexing has started in loop
             else{
                 // Loop for printing elements from
                 // front to max size or last index
                 for(int i = front; i < N; i++)
                 {
                     System.out.print(q[i]+"  ");
                 }
 
                 // Loop for printing elements from
                 // 0th index till rear position
                 for(int i = 0; i <= rear; i++)
                 {
                     System.out.print(q[i]+"  ");
                 }
             }
            System.out.println();
    }
    int front (){
          if (front>-1) {
              return q[front];
          }
          return front;
      }
      
      void enqueue(int data){
          if (isfull()) {
              System.out.println("Queue is Full");
              return;
          }
          else{
              if (front==-1) {
                  front=0;
              }
              rear = (rear+1)%N;
              q[rear] = data;
              n++;
          }
          
      }
      
      int dequeue(){
          int temp=0;
          if (isempty()) {
              System.out.println("Queue is Empty");
              return -1;
          }
          else{
              temp = q[front];
              front = (front+1)%N;
              //if front and rear both points to the same element 
              if (front==rear) {
                  front =-1; //set pointers to -1
                  rear =-1;
              }
              n--;
          }
          
          return temp;
      }
      boolean isfull(){
          return n==N;
      }
      
      boolean isempty(){
          return front==-1;
      }
}
