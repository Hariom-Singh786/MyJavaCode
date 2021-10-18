package AllSearchingAlg;
//time complexity is O(log n)
public class ExponentialSearch {
    public static void main(String[] args) {
        int [] arr= {1,3,8,10,15,19,30};
        int target= 15;
        int result= search(arr,target);
        System.out.println((result<0)?"Element is not found" :" Element is found at index :"+result);
    }
    public static int search(int[] arr , int target){
        int size= arr.length;
        //find the range where the value of target may present
        if(arr[0]==target){
            return 0;
        }
        if(target>arr[size-1]){
            return -1;
        }
        int i=1;
        while(i<size && arr[i]<=target){
            i= i*2;
        }
        return binarySerach(arr,i/2,Math.min(i,size-1),target);
    }

    private static int binarySerach(int[] arr, int i, int min, int target) {
        int mid= i +(min-i)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return binarySerach(arr,mid+1,min,target);
        }else{
         return binarySerach(arr,i,mid-1,target);
        }
    }
}
