package ArrayProblemsLeetcode.SearchingAlgorithm;

import java.util.Arrays;

//find number with even number of Digits
public class EvenDigit {
    public static void main(String[] args) {

        int [] nums={12,10,891,2872,1002,16782};
        System.out.println(Arrays.toString(nums));
        System.out.println("number of digits in it:" +digit1(-28378));
        int ans=findNumbers(nums);
        System.out.println(ans);
    }
    private static int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }return count;
    }
    // finding number of digits in the optimized way
    //time complexity is O(log n)
    static int digit1(int num){
        if(num<0){
          num=num*-1;
        }
        if(num==0){
            return 1;
        }
        return (int)(Math.log10(num))+1;
    }

    private static boolean even(int num) {
        int digit=digit1(num);
        return digit % 2 == 0;
    }

    // time complexity is O(n)
//    private static int digit(int num){
//        if(num<0){
//            num=num*-1;
//        }
//        if(num==0){
//            return 1;
//        }
//        int count=0;
//        while(num>0){
//            count++;
//            num/=10;
//        }return count;
//   }
}
