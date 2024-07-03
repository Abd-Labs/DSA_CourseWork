
package All;

import java.util.Arrays;
import java.util.Collection;


//Given an array of N integers where each value represents the number of chocolates in a packet.
//Each packet can have a variable number of chocolates. There are m students, 
//the task is to distribute chocolate packets such that: 
//
//Each student gets one packet.
//The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates 
//given to the students is minimum.

public class ChocolateProblem {
    
    public static void main(String[] args) {
        int arr[] = new int[] {3, 4, 1, 9, 56, 7, 9, 12} ;
        
        System.out.println(MinDifference(arr, 5));
    }
    
    public static int MinDifference(int arr[],int students){
        int min = Integer.MAX_VALUE;
        
        int N = arr.length; //total number of chocolates
        
         Arrays.sort(arr);
         
         for (int i = 0; (i+students-1)<arr.length; i++) {
             
             if (arr[i+students-1]-arr[i]<min) {
                 min = arr[i+students-1]-arr[i];
             } 
         }
        return min;
    }
}
