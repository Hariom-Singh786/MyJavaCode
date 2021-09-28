package ArrayProblemsLeetcode.GoodQuestions;
//[1,3,4,7,9,8,6,3,1]-> your answer is 9 as it is maximum element among the array
//we are going to perform binary search operation optimize the code better way
public class PeakElementInMountainArray {
    public static void main(String[] args){
        int [] arr={1,3,4,0,-10,-20,-50};
        int ans=peakElement(arr);
        System.out.println(ans);
    }
    static int peakElement(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in the descending part of the array
                //.this may be the answer but look at the left also
                end=mid;
            }else{
                //you are in the ascending part of the array
                //this may be the answer but look at the right also
                start=mid+1;
            }
        }return arr[start];// finally start and end will be at the same point so can return either of them
    }
}
