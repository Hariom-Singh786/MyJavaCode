package AllSortingAlgo;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr= {12,15,16,11,20,9};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int []arr,int start,int end){
        if(start<end){
            int mid= start+(end-start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);

        }
    }
    private static void merge(int[] arr, int start, int mid, int end) {
        int []temp = new int[arr.length];
        int i= start;
        int j= mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }else{
                temp[k]= arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k]= arr[i];
            i++;
            k++;
        }
        while(j<=end){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(int a= start;a<=end;a++){
            arr[a]= temp[a-start];
        }

    }
}
