// public class primeNum{
    
//     public static boolean isPrime(int num){
//         boolean value = true;
//         for(int i = 2; i <num; i++){
//             if(num%i == 0){
//                 value = false;
//                 break;
//             }
//         }
//         return value;
//     }


//     public static void main(String[] args){
//        isPrime(10);
//        System.out.println(""+isPrime(10));
//     };
// };


// -----------optimize prime number code ----------------------------------------------------



public class primeNum {
    
    public static boolean isPrime(int num) { 
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void primeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeRange(216);
    }
}
