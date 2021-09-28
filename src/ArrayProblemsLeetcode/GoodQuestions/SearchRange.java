package ArrayProblemsLeetcode.GoodQuestions;
//find start index and last index of target element found in sorted array
import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 7, 7, 7, 9, 10, 15, 15, 15};
        int target = 15;//ans->[8,10]
        int ans[] = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[] arr, int target) {
        int[] ans = {-1, -1};
        int start = searchIndex(arr,target,true);
        int end=searchIndex(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    public static int searchIndex(int [] arr,int target,Boolean isFound){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                ans=mid;//potential answer
                if(isFound=true){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }return ans;
    }
}