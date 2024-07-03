
//It is the simplest sort method which performs sorting by repeatedly moving the largest element
//to the highest index of the array. It comprises of comparing 
//each element to its adjacent element and replace them accordingly

package Algorithms;

public class BubbleSort {
    
    public static void main(String[] args) {
        int[] arr = new int []{3,2,8,5,91,12};
        int count =0;
        //after each iteration of this outer loop the largest element will move to the end of array
        for (int i = 0; i < arr.length; i++) {
            
            int flag=1;//flag to check if array is already sorted before all iterations of outer loop
            
            for (int j = 0; j < (arr.length-1-i); j++) {
                count++;
                //in each iteration if a element is greater than its succeeding entry swap them
                if (arr[j]>arr[j+1]) {
                    
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    
                    flag=0; // if some entries are swapped in inner loop set the flag to zero
                }
            }
           // if (flag==1) {
           // break;
           // }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(count);
        
    }
}
