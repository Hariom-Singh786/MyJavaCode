package ArrayProblemsLeetcode;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

//Build array from permutation
/*Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
* */
public class ArrayOfPermutation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("value of N:");
        int n=sc.nextInt();
        int [] nums=new int[n];
        System.out.println("Input elements of Array :");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int [] ans= new int[nums.length];
        ans=permutationOfArray(nums);
        for(int i=0;i<n;i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] permutationOfArray(int[] nums) {
        int length=nums.length;
        int[] ans= new int[length];
        for(int i=0;i<length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
