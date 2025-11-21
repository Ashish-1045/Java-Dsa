
import java.util.*;
public class question2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int choice ;
        int number;
        int evenSum =0;
        int oddSum = 0;

        do {
                System.out.println("Enter a prime number");
                number = sc.nextInt();

                if(number %2 ==0){
                    evenSum += number;
                }else{
                    oddSum +=number;
                }
    
                System.out.println("you want to countinou press 1 , too yes ");
             choice = sc.nextInt();
        }while(choice == 1);
            
        System.out.println("even" + evenSum);
        System.out.println("odd"+oddSum);
        
    }
}
