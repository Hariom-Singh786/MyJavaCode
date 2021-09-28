package ArrayProblemsLeetcode.SearchingAlgorithm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={-14,-9,-3,0,7,10,34,90,103,199};
        int target=-3;
        System.out.println(Arrays.toString(arr));
        int ans=binarySearch(arr,target);
        System.out.println(" target is found at index number :"+ans);
    }
     static int binarySearch(int [] arr,int target){
        int end=arr.length-1;
        int start= 0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid=1;
            }else{
                return mid;
            }
        }return -1;
     }
}
