
package All;

//reversing array using recursion

public class ReverseArray {
    
    
    public static void main(String[] args) {
         int  [] arr = new int[]{32,133,23,5,7,3,8,37,9,11,2,12};
         
         Reverse(arr, 0, (arr.length-1));
         
         for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]+ " ");
        }
    }
    
    public static void Reverse(int [] arr ,int start , int end){
        
        if (start>=end) {
            return;
        }
        
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        Reverse(arr, start+1, end-1);
        
    }
}
