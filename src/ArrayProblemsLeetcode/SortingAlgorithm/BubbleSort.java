package ArrayProblemsLeetcode.SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={1,2,-5,0,100,-23,0,-23};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int [] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j< arr.length-i;j++){
                //compare and swap
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            //if does not swap then array is sorted so break out of the loop
            if(!swapped){
                //means swapper= false
                break;
            }
        }
    }
}
