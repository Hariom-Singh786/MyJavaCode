package ArrayProblemsLeetcode.GoodQuestions;
//this question has been asked in google

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int [] arr= {7,2,5,10,8};
        int split=2;
        int ans= splitArray(arr,split);
        System.out.println(ans);
    }

    private static int splitArray(int[] arr,int m) {
        int start=0;
        int end=0;

        // to find the largest element and largest sum element
        for(int i=0;i<arr.length;i++){
            start= Math.max(start,arr[i]);
            end+=arr[i];
        }
        //binary search
        while(start<end){
            int mid=start+(end-start)/2;
           //calculate how many pieces you can divide this with this max sum
           int sum=0;
           int pieces=1;
           for(int num:arr){
                if(sum+num>mid){
                    //you can not add this subarray , make new one
                    //if you add this sum in new array say sum=num
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
           }
           if(pieces>m){
                start=mid+1;
           }else{
               end=mid;
           }
        }return end;//coz finally start and end will be the same
    }
}
