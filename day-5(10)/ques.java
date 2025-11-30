 //---------------------------------------- Average of three numbers----------------------------------------

// public class ques {
//     int a =88;
//     int b = 64;
//     int c = 53;
//     int avg = (a+b+c)/3;
  
//     public static void main(String[] args){
//         ques obj = new ques();
//         System.out.println("Average is: "+obj.  avg);
//     }
// }
 
// ---------------------------------------- Check even or odd number ----------------------------------------
// public class ques{
//     public static boolean isEven(int num ){
//         if(num % 2==0){
//             return true;
//         }else{
//             return false;
//         }
//     }

//     public static void main(String[] args){
//         System.out.println(isEven(10));
//         System.out.println(isEven(33));
//     };
    
// }

//---------------------------------------- Check palindrome number ----------------------------------------

// import java.util.*;
// public class ques{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n =sc .nextInt();
//         int temp = n;
//         int rev =0;

//         while(n>0){
//             int r = n%10;
//             rev = rev*10 + r;
//             n = n/10;
//         }
//         if(temp == rev){
//             System.out.println("Palindrome number");
//         } else {
//             System.out.println("Not a palindrome number");
//         }

//     };
// };

public class ques{
   
        public static int sumdigits(int n){
            int sum = 0;
            while(n>0){
                int lastdigit = n%10;
                sum +=lastdigit;
                n =n/10;
            }
            return sum;
        }
    
    public static void main(String[] args) {
        int n = 1234;
        System.out.println("Sum of digits: "+ sumdigits(n));
    }
}