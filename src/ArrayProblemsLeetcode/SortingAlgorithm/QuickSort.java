package AllSortingAlgo;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr= {10,9,13,90,67,89,3,12,45,21};
        System.out.println(Arrays.toString(arr));
        QuickSort qk= new QuickSort();
        qk.quickSort(arr,0,arr.length-1);
        qk.display(arr);
    }

    private void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int lb,int ub){
        if(lb<ub){
            int loc= partition(arr,lb,ub);
            quickSort(arr,lb,loc-1);
            quickSort(arr,loc+1,ub);
        }
    }

    private static int partition(int[] arr, int lb, int ub) {
        // pivot
        int pivot = arr[ub];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (lb - 1);

        for(int j = lb; j <= ub - 1; j++)
        {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot)
            {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, ub);
        return (i + 1);
    }

    private static void swap(int [] arr,int start, int end) {
        int temp= arr[start];
        arr[start]= arr[end];
        arr[end]= temp;
    }
}
