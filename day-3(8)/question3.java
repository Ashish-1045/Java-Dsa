import java.util.*;

public class question3 {
    public static void main(String arg[]){
       Scanner sc = new Scanner(System.in);
       int num ;
       int fact = 1;
    
       System.out.println("Enter a numberr");
       num = sc.nextInt();

       for(int i = 1 ; i<= num; i++){
         fact *= i;
       }

     System .out .println("factorial " + fact);


    }
}
