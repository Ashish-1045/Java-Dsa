// public class switchBreak {
//     public static void main(String arg[]){
//         int num = 2;

//         switch(num){
//             case 1 : System.out.println("first case");
//             break;
//             case 2 : System.out .println("second case");
//             break;
//             case 3 : System.out.println("third case");
//             break;
//         }
        
//     }
// }



import java.util.*;
public class switchBreak {
    public static void main(String arg[]){
     Scanner sc =  new Scanner(System.in);

     int a = sc.nextInt();
     int b = sc.nextInt();
     char oprator = sc.next().charAt(0);
     switch(oprator){
        case '+': System.out.println(a + b);
         break;
        case '-': System.out.println(a-b);
        break;
        case '/' : System.out.println(a/b);
        break;
        case '*' : System.out.println(a*b);
        break; 

     }

    }
}
