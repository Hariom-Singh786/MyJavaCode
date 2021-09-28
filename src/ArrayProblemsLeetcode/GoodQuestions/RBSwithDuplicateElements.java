package ArrayProblemsLeetcode.GoodQuestions;

public class RBSwithDuplicateElements {
    public static void main(String[] args) {
        int [] arr={3,3,5,6,6,1,2,3,3};
        int target=3;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int [] arr,int target){
        int pivot= searchinDuplicatePivot(arr);
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
    static int searchinDuplicatePivot(int [] arr){
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
           if(arr[mid]==arr[start] && arr[mid]==arr[end]){
               //skipping the duplicates value
               if(arr[start]>arr[start+1]){
                   return start;
               }start++;
               if(arr[end]<arr[end-1]){
                   return end-1;
               }end--;
           }else if(arr[start]<arr[mid] || arr[start]==arr[mid] &&arr[mid]>arr[end]){
               start=mid+1;
           }else{
               end=mid-1;
           }
        }return -1;
    }
}
