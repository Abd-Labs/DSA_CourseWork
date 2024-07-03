//There is an integer array nums sorted in ascending order (with distinct values).
//
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) 
//
//such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
//
//For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//
//Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums,
//
//or -1 if it is not in nums.
//
//You must write an algorithm with O(log n) runtime complexity.

package All;


public class RotatedArray {
    
    public static void main(String[] args) {
        int arr [] = new int[]{5,1,2,3,4};
        
        // first of all find the point of inflection (point of rotation)
        int point = FindMinIndex(arr);
//        System.out.println(point);

        System.out.println(Search(arr, point, 6));
    }
    
    // O(logn) complexity
     public static int FindMinIndex(int[] nums) {
    
    // if the array is rotated then find the point of rotation(inflection point)
    //array is rotated if the element at last index of array is smaller than element at 0th index
    if(nums[0]>nums[nums.length-1]){
        //apply modified binary search
        int l=0;
        int r=nums.length-1;
         
         while(l<r){
             //calculate midpoint
              int midpoint = l+(r-l)/2;
              //element at midpoint
              int middle =nums[midpoint];
              
              int left=Integer.MAX_VALUE;
              int right=Integer.MIN_VALUE;
              //element at left of midpoint
              if(midpoint!=0)
              left=nums[midpoint-1];
              
              //element at right of midpoint
              if(midpoint!=nums.length-1)
              right = nums[midpoint+1];
              
              // if element at midpoint is smaller than the element towards its left
              // it means the midpoint is point of inflection
              if(left>middle)
              return midpoint;
               // if element at towards right of midpoint is smaller than it
              // it means the element right to midpoint is point of inflection
              if (right<middle)
              return midpoint+1;
              // if not above both cases then check 
              
//            if the mid element is greater than element at leftmost then it means
//            left subarray is sorted and we can't find point of inflection there
             if(nums[l]<nums[midpoint])
                  l=midpoint+1; //move left to next of midpoint
             //if it is smaller it means right subarray is sorted
             else  r =midpoint-1;
         }
    }
    // if the array is not rotated then minimum is at index 0
     return 0;
     }
     
         // O(logn) complexity
     public static int Search(int [] arr,int point,int target){
         int index=-1;
         
         
         // first of all check subarray from point of inflection till end
         
         int l=point;
         int r = arr.length-1;
         
         
         while(l<=r){
              int midpoint = l+r/2;
              
              if (arr[midpoint]==target) 
                 return midpoint;
             
              if (arr[midpoint]>target) 
                  r = midpoint-1;
             
                
             if(arr[midpoint]<target)
                   l=midpoint+1;
              
                 
         }
         
//         // if element  is not found right of inflection point then look at left
//         if(index==-1){
//         
//         int left=0;
//         int right = point-1;
//         
//           while(left<right){
//              int midpoint = left+(right-left)/2;
//              
//              if (arr[midpoint]==target) {
//                 index=midpoint;
//             }
//              else if (arr[midpoint]>target) {
//                  right = midpoint-1;
//             }
//              else left=midpoint+1;
//         }
//         }
         
         return index;
     }
}
    
   