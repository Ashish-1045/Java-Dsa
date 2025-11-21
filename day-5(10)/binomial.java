public class binomial {
   
    public static int biocf(int n, int r){
        int A = factorail(n);
        int B = factorail(r);
        int C = factorail(n - r);
        return A / (B * C);
    }

    public static int factorail(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
      System.out.println("Binomial Coefficient C(n, r) is: " + biocf(5, 2));

    }
}
