package ArrayProblemsLeetcode.SearchingAlgorithm;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr= { {1,4,90,78},
                        {4,72,6,80,65},
                            {5,7}};
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
//        int target=6;
//        int[] ans=search(arr,target);
//        System.out.println(Arrays.toString(ans));
        int result=maxOfArray(arr);
        System.out.println("Maximum element of this array is :"+result);
    }
    static int maxOfArray(int [][] arr){
        int max=Integer.MIN_VALUE;
        if(arr.length<=0){
            return Integer.MIN_VALUE;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }return max;
    }
    //finding row and column of searched array
//
//    private static int [] search(int[][] arr, int target) {
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                if(arr[i][j]==target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }
}
