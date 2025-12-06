public class reverseArr {
     
    public static int reverse(int number[]){
        int start = 0;
        int end = number.length-1;
       
        while(start < end){
            int temp = number[start];
          number[start] = number[end];
          number[end]= temp;

          start++;
          end--;


        }
        return 0;
    }
    public static void main(String[] args){
        int number[] = {10,20,30,40,50}; 
        reverse(number);
        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }
      
    }
}
