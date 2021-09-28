package FunctionProbs;
//Write a function that returns the sum of first n natural numbers.
public class SumOfNums {
    public static void main(String[] args) {
        int n=10;
        int sum=sumOfNumbers(n);
        System.out.println("Sum of" +n+" natural numbers :" +sum);
    }

    private static int sumOfNumbers(int n) {
        int result;
        result=(n*(n+1))/2;
        return result;
    }
}
