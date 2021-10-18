package AllSortingAlgo;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int [] arr= {3,9,10,1,23,12,11,30};
        System.out.println(Arrays.toString(arr));
        HeapSort hp= new HeapSort();
        hp.sort(arr);
        hp.display(arr);
    }
    public static void sort(int [] arr){
        int n= arr.length;
        //build max Heap
        for(int i= n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        //heap sort
        for(int i=n-1;i>=0;i--){
            int temp= arr[0];
            arr[0]= arr[i];
            arr[i]=temp;
            //heapify root element
            heapify(arr,i,0);
        }

    }

    private static void heapify(int[] arr, int n, int i) {
        int largest= i;
        int l= i*2+1;
        int r= i*2+2;
        if(l<n && arr[l]>arr[largest]){
            largest= l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest= r;
        }
        if(largest!=i){
            int swap= arr[i];
            arr[i]= arr[largest];
            arr[largest]=swap;
            heapify(arr,n,largest);
        }
    }
    public static void display(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
