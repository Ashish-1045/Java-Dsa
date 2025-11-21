public class funcoverloading {
    
 public static int sum(int a,int b){
    return a+b;
 }
 public static int sum(int a,int b ,int c){
    return a+b+c;
 }

 public static void main(String[] args){
    System.out.println("Sum of two numbers:"+ sum(5,100));
    System.out.println("Sum of three numbers:"+ sum(5,100,10));
 }

}
