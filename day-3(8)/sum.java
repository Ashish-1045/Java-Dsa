import java.util.*;
public class sum {
   public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1;
    int add= 0;

    while(i <= n) {
        add += i;
        i++;
    }
    System.out.println(add);
   }
}
