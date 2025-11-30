public class invertedHalfPyramid {
    
   public static void pattern(int a){

    for(int i= 1; i<=a; i++){

       for(int j = 1; j<=a-i; j++){
        System.out.print(" ");
       }

        for(int j = 1; j<=i; j++){
            System.out.print("x");
        
       }
       System.out.println();
    } 

 }
public static void main(String[] args){
   pattern(3);
 }

}
