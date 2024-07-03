
package Algorithms;

public class quickSort {
    
    public static void main(String[] args) {
        int [] arr = new int[]{4,6,3,2,7,3,9,4,6,2,8,5};
        
        quicksort(arr,0,arr.length-1);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void  quicksort(int [] arr, int low, int high){
       // quick sort base case is when low index becomes greater than high
        if (low<high) {
            //select a pivot
            // partition the array into two parts lower element to left of pivot
            //and larger to right 
            int pidx = partition(arr,low,high); 
            // call the quick sort for lower and greater sides of pivot recursively
            quicksort(arr, low, pidx-1);
            quicksort(arr, pidx+1, high);
        }
   }
   
    public static int  partition(int [] arr,int low , int high){
        //select the right most element as pivot
        int pivot = arr[high];
        
        int  i=low-1; // pointer to store the location of pivot after dividing array into two parts
        
        //iterate over the portion of array from index low to high
        for (int j = low; j < high; j++) {
            //if a particular index of the array is less than pivot
            if (arr[j]<pivot) {
              i++; // increment the i pointer
              
              // swap the element at that index with element at ith index
              int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
        } // after this loop all the elements smaller than pivot has been placed at the 
        //positions low uptill i pointer
        
               i++; //update i pointer one last time and place the pivot at that index and already present value at end of array
               int temp = arr[i];
               arr[i] = pivot;
               arr[high] = temp;
        //return the index of the pivot
        return i;
    }
}

