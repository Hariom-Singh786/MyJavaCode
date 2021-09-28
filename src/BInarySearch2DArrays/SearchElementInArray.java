package BInarySearch2DArrays;

import java.util.Arrays;

//implementing binary search in  2D array and finding target element
public class SearchElementInArray {
    public static void main(String[] args) {
        int [][]arr={{10,20,30,40},
                     {15,25,35,45},
                     {20,27,37,49},
                     {28,32,42,52}};
        //this way is also correct but have to write more lines of code
       // int target= 45;
//        int [] ans;
//        ans=searchElement(arr,target);
//        System.out.println(Arrays.toString(ans));
//
        //another way to print the output
        System.out.println(Arrays.toString(searchElement(arr,42)));

    }

    private static int[] searchElement(int[][] arr, int target) {
        int row=0;
        int col=arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }else if(arr[row][col]<target){
                row++;
            }else{
                col--;
            }
        }return new int[]{-1,-1};
    }
}
