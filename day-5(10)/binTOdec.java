// public class binTOdec{
//  public static void bintodec(int binum){
//    int pow = 0;
//    int decnum = 0;

//   while(binum >0){
//     int lastdigit = binum % 10;
//     decnum = decnum +(lastdigit * (int) Math.pow(2,pow));

//     pow++;
//     binum = binum/10;

//   }
//     System.out.println("Decimal number is: "+decnum);
//  }
//     public static void main(String[] args){
//       bintodec(100);
//     }
// }



// -----------decimal to prime number code ----------------------------------------------------

import java.util.Scanner;

public class binTOdec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int decnum = 0;
        int pow = 0;

        while (num > 0) {
            int lastdigit = num % 10;
            decnum = decnum + (lastdigit * (int)Math.pow(2, pow));
            pow++;
            num = num / 10;
        }

        System.out.println("Decimal number is: " + decnum);
    }
}
