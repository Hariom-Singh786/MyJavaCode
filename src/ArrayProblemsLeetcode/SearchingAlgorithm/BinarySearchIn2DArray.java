package ArrayProblemsLeetcode.SearchingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

//array element will be sorted in ascending order row and column wise both
public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("input a number for rows and column :");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][] arr= new int[row][col];
        //taking array element from user
        System.out.println("Input Array elements (Elements should be increasing):");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }// printing array into console
        for(int []a:arr){
            for(int b:a){
                System.out.print(b+"  ");
            }
            System.out.println();
        }
//        int [] ans= new int[2];
        System.out.print("Input target element :");
        int target=sc.nextInt();
//        ans=searchInArray(arr,target);
        System.out.println(Arrays.toString(searchInArray(arr,target)));
    }
    private static int[] binarySearch(int [][]arr,int rows,int cstart,int cend,int target){
        while(cstart<=cend){
            int mid=cstart+(cend-cstart)/2;
            if(arr[rows][mid]==target){
                return new int[]{rows,mid};
            }
            if(arr[rows][mid]>target){
                cend=mid-1;
            }else{
                cstart=mid+1;
            }
        }return new int[]{-1,-1};
    }

    private static int[] searchInArray(int[][] arr, int target) {
        int rows=arr.length;
        int col=arr[0].length;
        int rstart=0;
        int rend=arr.length-1;
        int cstart=0;
        int cend=arr[0].length-1;
        int cmid=(rstart+rend)/2;

        if(rows==1){
            return binarySearch(arr,rows,0,col-1,target);
        }
        while(rstart<(rend-1)){
            int mid=rstart+(rend-rstart)/2;
            if(arr[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            if(arr[mid][cmid]>target){
                rend=mid;
            }else{
                rstart=mid;
            }
        }
        //now we have two rows
        //check weather the element is in the column of two rows
        //target in 1st half
      if(target<=arr[rstart][cmid-1]){
            return binarySearch(arr,rstart,0,cmid-1,target);
      }//target in 2nd half
      if(target>=arr[rstart][cmid+1]&&target<=arr[rstart][col-1]){
            return binarySearch(arr,rstart,cmid+1,col-1,target);
        }//target in 3rd half
      if(target<=arr[rstart+1][cmid-1]){
            return binarySearch(arr,rstart+1,0,cmid-1,target);
        }//target in 4th half
      else{
            return binarySearch(arr,rstart+1,cmid+1,col-1,target);
        }
    }
}
