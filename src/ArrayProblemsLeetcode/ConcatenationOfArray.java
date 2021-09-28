package ArrayProblemsLeetcode;

import java.util.Scanner;

////Concatenation of Array
public class ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input value of n:");
        int n= sc.nextInt();
        System.out.print("Array elements :");
        int [] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int [] ans= new int[nums.length];
        ans=concatenation(nums);
        for(int i=0;i<2*n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int [] concatenation(int [] nums){
        int n=nums.length;
        int[] ans= new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
            //return ans;
        }return ans;
    }
}
