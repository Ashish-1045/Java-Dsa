
import java.util.Scanner;
public class inputUpdateOutput {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0] =sc.nextInt();
        marks[1] = sc.nextInt();
        marks[5] = sc.nextInt();
      
        System.out.println("p" + marks[0]);
        System.out.println( "o" + marks[1]);
        System.out.println(
            "q" + marks[5]);
       
    }
}
