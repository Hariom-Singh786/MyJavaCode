package ArrayProblemsLeetcode.GoodQuestions;
//find position of element in an infinite array ->
// array is sorted so apply binary search
public class PosOfElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr= {1,2,8,10,13,16,20,30,40,87,90,100,201,302};
        int target = 30;
        int ans=range(arr,target);
        System.out.println(ans);
    }
    static int range(int [] arr, int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        } return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int [] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }return -1;
    }
}
