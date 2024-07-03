
package Algorithms;


public class InsertionSort {
    
    public static void main(String[] args) {
        int[] arr = new int []{3,6,4,7,3,8,3,6,34,23,1,22,9};
        
        //starting from second element of the array till the end
        for (int i = 1; i < arr.length; i++) {
            
            // store each element in the key
            int key = arr[i];
            int j=i-1;
            //while all the previous element are greater than the key
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j]; //move them one place to the right
                
                j--;
            }
            //at the end place the key at the index where shifting in while loop ended
            arr[j+1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
              System.out.println(arr[i]);
        
        }
    }
}
