package AllSortingAlgo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr= {12,15,10,11,20,9};
        System.out.println(Arrays.toString(arr));
        sort(arr);
    }
    private static void sort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int left, int right) {
        int temp= arr[left];
        arr[left]= arr[right];
        arr[right]= temp;
    }
}
