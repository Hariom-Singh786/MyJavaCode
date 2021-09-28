package ArrayProblemsLeetcode.SortingAlgorithm;
// I am writing code for selection sort and insertion sort both
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={2,0,8,4,3,9,-3};
        System.out.println(Arrays.toString(arr));
        //selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    static int getMaxIndex(int [] arr,int start,int last){
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }return max;
    }
    static void swap(int [] arr,int start,int last){
        int temp=arr[start];
        arr[start]=arr[last];
        arr[last]=temp;
    }
    static void selectionSort(int [] arr){
        for(int i=0;i<arr.length;i++){
          int last=arr.length-i-1;
          int maxIndex= getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
}
