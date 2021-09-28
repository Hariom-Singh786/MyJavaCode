package ArrayProblemsLeetcode.GoodQuestions;
//{a,h,i,k,m,o} target j-> ans->k
public class SmallestLetter {
    public static void main(String[] args) {
        char [] arr={'c','f','g','j','l','n','o','p'};
        char target='n';
        char ans=letter(arr,target);
        System.out.println(ans);
    }

    private static char letter(char[] arr, char target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start +(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }return arr[start%arr.length];
    }
}
