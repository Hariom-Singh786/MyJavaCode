package Intermediate;

//import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        int sum=0;
        int rem;
        int i;
        for(i=100;i<1000;i++){
            while(i>0){
                rem=i%10;
                i/=10;
                sum+=(rem*rem*rem);
            }
            if(i==sum){
                System.out.print(sum + "  " );
            }
        }
//        Scanner sc = new Scanner(System.in);
//
//       / System.out.print("Input a +ve Number :");
//        int num=sc.nextInt();
//        int sum=0;
//        int temp=num;
//        int rem;
//        while(num>0){
//            rem=num%10;
//            num/=10;
//            sum+=(rem*rem*rem);
//        }
//        if(sum==temp){
//            System.out.println("Bhaiya number " +sum+ " Armstrong Hai");
//        }else{
//            System.out.println("Armstrong nhi Ayye");
//        }
//    }

    }
}
