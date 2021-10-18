package AllSearchingAlg;
//Interpolation search is quite better than Binary search
//array should be sorted to implement interpolation search
public class InterpolationSearch {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12};
        int target= 13;
        int index = search(arr,target);
        if(index==-1){
            System.out.println("Element not found in the array");
        }else{
            System.out.println("Element present at index no :"+index);
        }
    }
    public static int search(int [] arr ,int target){
        int size = arr.length;
        int lo=0;
        int hi= size-1;
        while(lo<=hi && target>=arr[lo] && target<= arr[hi]){
            if(lo==hi){
                if(arr[lo]==target){
                    return lo;
                }
                return -1;
            }
            int pos = lo + ((target-arr[lo])*(hi-lo)/(arr[hi]-arr[lo]));
            if(arr[pos]<target){
                lo= pos+1;
            }
            if(arr[pos]==target){
                return pos;
            }
            else{
                hi= pos-1;
            }
        }return -1;
    }
}
