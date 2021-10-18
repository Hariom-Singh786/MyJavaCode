package AllSortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr= {12,15,10,11,20,9};
        //printing unsorted array
        System.out.println(Arrays.toString(arr));
        //print sorted array
        sort(arr);
    }
    public static void sort(int [] arr){
        for(int i=0;i<arr.length;i++){
            int min= i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                   min = j;
                }
            }
            int temp= arr[min];
            arr[min]= arr[i];
            arr[i]= temp;

        }
//        for(int j=0;j<arr.length;j++){
//            System.out.print(arr[j] +" ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}
