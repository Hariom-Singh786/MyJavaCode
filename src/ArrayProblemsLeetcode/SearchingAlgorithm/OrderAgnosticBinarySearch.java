package ArrayProblemsLeetcode.SearchingAlgorithm;
//first I will find weather arr is sorted in ascending or descending order then apply algorithm
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={100,98,89,83,39,20,10,3,-10,-30};
        int target=83;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = false;
        if(arr[start]<arr[end]){
            isAsc=true;
        }
        //search with ascending elements
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
              if (target < arr[mid]) {
                end = mid - 1;
              } else if (target > arr[mid]) {
                start = mid + 1;
               } 
            }
            else{
                if (target < arr[mid]) {
                    start = mid + 1;
                } else  if (target > arr[mid]) {
                    end = mid - 1;
                }

            }
        }return -1;
    }
}
