import java.util.*;
public class product {
    public static void main (String[] args){
        P();
    }
    public static void P(){
    
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("this is product" + product);
       sc.close();

    }

}

