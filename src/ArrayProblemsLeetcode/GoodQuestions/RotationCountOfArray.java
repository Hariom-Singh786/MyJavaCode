package ArrayProblemsLeetcode.GoodQuestions;

public class RotationCountOfArray {
    public static void main(String[] args) {
        int [] arr={5,6,9,10,-1,0,2,3,3,3};
        int ans=search(arr);
        System.out.println(ans);
    }

    private static int search(int[] arr) {
        int piv = searchPivot(arr);
        return piv+1;
        //int count = 0;
//        for (int i = 1; i < piv; i++) {
//            if (arr[i] < arr[piv]) {
//                count++;
//            } else {
//                break;
//            }
//        }return count+1;
    }
    //search when duplicates element present in array
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
    //search when unique elements present in the array
        private static int searchPivot(int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid - 1;
                }
                if (arr[mid] <= arr[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }
    }
