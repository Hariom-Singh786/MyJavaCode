package ArrayProblemsLeetcode.GoodQuestions;
//if array is sorted in two parts and need to find target in either of part
//this code requires no pivot element
/*
  int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target<=nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                if(target>=nums[mid]&&target<=nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }return -1;

*/
public class RBS {
    public static void main(String[] args) {
        int [] arr= {3,5,8,10,-3,0,1,2};
        int target= 1;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int [] arr,int target){
       int pivot= searchPivot(arr);
       if(pivot==-1){
           //if pivot element not found then array is not rotated
           // so do normal binary search
           return binarySearch(arr,target,0,arr.length-1);
       }
       //if pivot is found means you found two ascending binary arrays
        if(target==arr[pivot]){
            return pivot;
        }
        if(target>arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }
    static int binarySearch(int [] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }return -1;
    }
    static int searchPivot(int [] arr){
        int start=0;
        int end=arr.length -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                  return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return -1;
    }
}
