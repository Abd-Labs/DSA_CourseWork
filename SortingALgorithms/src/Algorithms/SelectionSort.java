
//Selection sort finds the smallest element in the array and place it on the first place on the list, 
//then it finds the second smallest element in the array and place it on the second place. 
//This process continues until all the elements are moved to their correct ordering. 
//It carries running time O(n2) which is worst than insertion sort.
package Algorithms;

public class SelectionSort {
    
    
    public static void main(String[] args) {
        
        int[] arr = new int []{3,2,5,5,8,98,76,4,5,9,45,99,12,14,14,56,72,1};
        
        for (int i = 0; i < arr.length-1; i++) {
            //in outer loop mark the ith index of array as minimum value
            int min = i;
            
            for (int j = i+1; j < arr.length; j++) {
                // in inner loop check if there is anyother smaller value in array then at ith index
                if (arr[j]<arr[min]) {
                    //if present then mark its index as minimum
                    min =j;
                }
            }
            //after loops swap the value at ith and min index
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i] = temp;
        }
        
        for (int i = 0; i < arr.length; i++) {
              System.out.println(arr[i]);
        
        }
    }
}
