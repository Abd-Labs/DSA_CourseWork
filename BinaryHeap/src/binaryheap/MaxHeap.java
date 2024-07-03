
package binaryheap;

public class MaxHeap {
    int [] heap;
    int size;
    public static final int MAX_SIZE=15;
    
    public MaxHeap(){
        heap = new int[MAX_SIZE];
        size=0;
        
    }
    
    public int parent(int i){
        return (i-1)/2;
    }
    public int leftchild(int i){
        return (2*i)+1;
    }
    public int rightchild(int i){
        return (2*i)+2;
    }
    
    public boolean isLeaf(int i){
        if (i>(size/2) && i<size) {
            return true;
        }
        else
        { return false;}
    }
    public void  swap(int first,int second){
        int temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }
    
    public void heapifyup(int i){
        while (i>0 && heap[parent(i)]<heap[i]) {            
            swap(i, parent(i));
            i=parent(i);
        }
    }
    public void heapifydown(int index){ 
         
       for(int i=0;i<this.size;) {   
            int max = index;
        
            int left = leftchild(index);
            int right = rightchild(index);
            
            if (heap[left]>heap[max]) {
                max=left;
            }
            if (heap[right]>heap[max]) {
                right = max;
            }
            if (max<=size) 
            swap(heap[i], heap[max]);
            
        }
    }
    
    public void insert(int data){
        if (size>=MAX_SIZE) {
            System.out.println("Heap is full");
        }
        size++;
        heap[size]=data;
        
       heapifyup(size);
    }
    
    public int getMax(){
        int temp=heap[0];
        heap[0] = heap[size];
        size--;
        return temp;
    }
}
