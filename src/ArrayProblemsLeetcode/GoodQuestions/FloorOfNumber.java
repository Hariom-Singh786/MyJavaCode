package ArrayProblemsLeetcode.GoodQuestions;
//Floor of a Number
// means find the greatest number which is just smaller than or equal to your target number

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr={2,3,10,18,20,42,53,89,100};
        int target=43;
        int ans=floor(arr,target);
        System.out.println(ans);
    }

    private static int floor(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }else{
                return arr[mid];
            }
        }return arr[end];
    }
}
