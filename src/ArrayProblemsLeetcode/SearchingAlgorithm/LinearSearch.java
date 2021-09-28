package ArrayProblemsLeetcode.SearchingAlgorithm;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Value of N: ");
        int n=sc.nextInt();
        System.out.print("Input array elements:");
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("target value:");
        int target= sc.nextInt();
        boolean ans= linearSearch(arr,target);
        if(ans==true)
              System.out.println(ans+ "Found" );
        if(ans==false)
            System.out.println(ans+ " Not Found");
    }
    static boolean linearSearch(int [] arr,int target){
        if(arr.length==0){
            return false;
        }
//        for(int i=0;i<arr.length;i++){
//            int value=arr[i];
//            if(target==value){
//                return i;
//            }
//        }
        //looping using enhanced for loop
        for(int element:arr){
            if(element==target){
                return true;
            }
        }
       return false;
    }
}
