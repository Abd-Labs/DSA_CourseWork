
package All.MaxMin;



// maximum and Minimum element in an array using Divide and conquer

public class Main {
    
    public static void main(String[] args) {
        
        int  [] arr = new int[]{32,133,23,5,7,3,8,37,9,11,2,12};
        
        System.out.println(findMaxMin(arr, 0, arr.length-1));
        
    }
    
    public static Pair findMaxMin(int arr[],int low , int high){
        Pair pair = new Pair();
        Pair minmax1 = new Pair(); //for left subarray
        Pair minmax2 = new Pair(); // for right subarray
        
          int midpoint = low + ((high-low)/2);
        
      
      
        if (low==high) {
            pair.min=arr[low];
            pair.max=arr[low];
            
            return pair;
        }
        if (low == high+1) {
            
            if (arr[low]>=arr[high]) {
                pair.max=arr[low];
                pair.min=arr[high];
            }
            if (arr[low]<arr[high]) {
                pair.min=arr[low];
                pair.max=arr[high];
            }
            
            return pair;
        }
        
        minmax1 = findMaxMin(arr, low, midpoint);
        minmax2 = findMaxMin(arr, midpoint+1, high);
        
        if (minmax1.min<=minmax2.min) {
            pair.min=minmax1.min;
        }
        else pair.min =minmax2.min;
        
        if (minmax1.max>=minmax2.max) {
            pair.max = minmax1.max;
        }
        else pair.max = minmax2.max;
    
        return pair;
    }
}













