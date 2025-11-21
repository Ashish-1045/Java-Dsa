import java.util.*;

public class taxcal{
    public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      int tax = 0;

      if(number <= 50000){
        tax = 0 ;
       } 
      else if(number >= 100000){
        tax = (int) (number*0.2);
      }
      else{
        System.out.println("not tax included");

      }
 
      System.out.println("tax" + tax);
    }
}