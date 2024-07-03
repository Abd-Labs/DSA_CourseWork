
package All;
import java.util.*;
//check if array contains duplicate element in less than O(n^2) time


import java.util.concurrent.PriorityBlockingQueue;

public class Duplicate {
    
    // if we want to do in constant space then time complexity will be O(nlogn) by making a priority queue or sorting
    // we can reduce time complexity to O(n) by increasing space complexity to O(n)
    public static void main(String[] args) {
        int  [] arr = new int[]{32,133,23,5,7,3,8,37,9,33,12};
        
        System.out.println(Duplicate(arr));
    }
    
    public static boolean Duplicate(int [] arr){
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                return true;
            }
            else {
                map.put(arr[i], 1);
            }
        }
        
        return false;
    }
}