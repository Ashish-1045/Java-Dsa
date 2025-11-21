import java.util.*;

public class question4 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        for(int i = 1 ; i <=10; i++){
            System.out.println(n + "*"+i + "=" + n*i);
        }
    }
}




