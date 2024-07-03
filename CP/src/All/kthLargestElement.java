
package All;

import java.util.TreeMap;
import java.util.TreeSet;

public class kthLargestElement {
   
    public static void main(String[] args) {
         
        int arr[] = new int[]{2,5,1,1,4,3,2,9,7,8,4};
        
        System.out.println(find(arr,5));
    }
    
    
    public static int find(int [] arr,int k){
        
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            
            if (tm.containsKey(arr[i])) {
                tm.put(arr[i], tm.get(arr[i])+1);
            }
            else{
                tm.put(arr[i], 1);
            }
        }
        int i=0;
        
        while (true) {            
           int key = tm.lastKey();
           
           i+= tm.get(key);
           
            if (i>=k) {
                return key;
            }
            
            tm.pollLastEntry();
        }
      
    }
}
