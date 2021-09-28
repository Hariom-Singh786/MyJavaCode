package ArrayProblemsLeetcode.SearchingAlgorithm;
//[1, 5 ,-9, 10 30] find minimum element
public class MinimumInRangeOfArray {
    public static void main(String[] args) {
        int[] arr= {2,5,10,19,3,30,0,89};
        System.out.println(minimum(arr));
    }

    private static int minimum(int[] arr) {
        int min=arr[0];
        if(arr.length==0){
            return 0;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }return min;
    }
}
