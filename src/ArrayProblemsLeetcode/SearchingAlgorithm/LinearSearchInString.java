package ArrayProblemsLeetcode.SearchingAlgorithm;

import java.util.Arrays;

public class LinearSearchInString {
    public static void main(String[] args) {
        String name= "Chhitamani";
        char target='m';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name +" target "+target+" :"+search(name,target));
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
//       for(int i=0;i<str.length();i++){
//           if(target==str.charAt(i)){
//               return true;
//           }
//       }
        //using foreach loop or enhances for loop
        for(char ch:str.toCharArray())
        {
            if(ch==target){
                return true;
            }
        }
       return false;
    }
}
