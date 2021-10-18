package AllSearchingAlg;

public class JumpSearch {
    //jump search is more efficient than linear seach but less efficient than binary search
    // array should be sorted before applying jump search algorithm
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int target = 12;
        //find index where target is located
        int index = search(arr, target);
        if (index == -1) {
            System.out.println(+target + " element is not present");
        } else {
            System.out.println(+target + " is present at index :" + index);
        }
    }

    private static int search(int[] arr, int target) {
        int jump= (int)Math.floor(arr.length);
        int currentIndex= jump-1;
        while(currentIndex<arr.length && target>arr[currentIndex]){
            currentIndex+=jump;
        }
        //apply linear search
        for(int i= currentIndex-jump+1;i<=currentIndex &&i<arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }return -1;
    }
}
//    }
//    public static int search(int [] arr, int target){
//        int length= arr.length;
//        int jump = (int)Math.sqrt(length);
//        int i=0;
//        int count=0;
//        while(i<length){
//            if(target == arr[i]){
//                return i;
//            }
//            else if(target == arr[jump]){
//                return jump;
//            }
//            else if(target> arr[i] && target<arr[jump]){
//                return binarySearch(arr,i+1,jump-1,target);
//            }
//            else{
//                if(target>arr[jump] || target <arr[length-1]) {
//                    count++;
//                    i = jump;
//                    jump += i;
//                }
//           }
//        }return -1;
//    }
//
//    private static int binarySearch(int[] arr, int s, int e, int target) {
//            int mid= s+(e-s)/2;
//            if(target==arr[mid]){
//                return mid;
//            }
//            if(target<arr[mid]){
//                return binarySearch(arr,s,mid-1,target);
//            }else{
//                return binarySearch(arr,mid+1,e,target);
//            }

