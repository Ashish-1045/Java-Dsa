
import java.util.Scanner;
public class params{
  
    
    public static void calculate(int a, int b){
       
  int sum = a + b;

    System.out.println("the sum is "+ sum );
    }

   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculate(a,b);
   }

}
