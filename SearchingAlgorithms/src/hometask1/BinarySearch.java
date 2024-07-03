
package hometask1;


public class BinarySearch{
    
    public static int binarySearch(int[] arr,int target){
  
        // DEFINE A STARTING AND END POINTER
        int s=0,e=arr.length;
        
        //RUN A LOOP TILL START POINT BECOMES GREATER THAN END POINTER
        while (e>=s) {            
            
            //FIND A MID POINT
            int mid = (e+s)/2;
            
            //IF VALUE AT MID INDEX POINT MATCHES OUR TARGET
            if (arr[mid]==target) {
                return mid; //RETURN MID
            }
            //IF VALUE AT MID OF OUR ARRAY IS GREATER THAN TARGET
            if (arr[mid]>target) {
                //MOVE THE END POINTER BEFORE THE CURRENT MID TO REDUCE SIZE OF ARRAY
                e=mid-1;
            }
            //IF VALUE AT MID OF OUR ARRAY IS SMALLER THAN TARGET
            if (arr[mid]<target) {
                 //MOVE THE START POINTER AFTER THE CURRENT MID TO REDUCE SIZE OF ARRAY
                s=mid+1;
            }
        }
        //IF TARGET IS NOT PRESENT RETURN -1
        return -1;
}
    
    public static void main(String[] args) {
        
        int [] arr = new int[]{3,5,7,9,13,19,23,29,33,36,43,48,49,57};
        
        System.out.println(binarySearch(arr,49));
    
}
}