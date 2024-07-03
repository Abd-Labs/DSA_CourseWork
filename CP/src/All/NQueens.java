
Package All;

import java.util.*;


class NQueens {
   
    
    public static void main(String[] args) {
          int len=3;

        char arr[][] = new char[len][len];

         for (int k = 0; k < arr.length; k++) {
                for (int l = 0; l < arr.length; l++) {
                    
                   arr[k][l] = '.';
                }
                System.err.println();
            }


        Solve(arr,0);
    }


    public static void Solve(char arr[][], int i) {
        
       

        if(i==arr.length){
              System.out.println("....Chess Board....");
             for (int j = 0; j < arr.length; j++) {
                for (int  k= 0; k < arr.length; k++) {
                    
                    System.out.print(arr[j][k]);
                }
                 System.out.println();
            }

           
             System.out.println();
              System.out.println();
            return;
        }

       for(int j=0;j<arr.length;j++){

            arr[i][j] ='Q';

            Solve(arr,i+1);

            arr[i][j] ='.';

       }
     
    }
}