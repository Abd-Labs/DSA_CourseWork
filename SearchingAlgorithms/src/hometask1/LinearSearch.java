public class LinearSearch{
    
    public static int LinearSearch(int [] arr,int target){
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i]==target) {
                return i;
            }
        }
        
        
        return -1;
    }
    public static void main(String[] args) {
    
        int [] arr = new int[]{1,2,5,3,6,7,8,3,6,18,8,23,23,51,43,64,5,78,84};
        
        int target = 43;
        
        System.out.println(LinearSearch(arr, target));
}
}