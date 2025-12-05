public class lagestNum {
    
    public static int largest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 1 ; i <numbers.length; i++){
            if(largest< numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
  


    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        
        System.out.println("Largest number is: "+largest(numbers));out.println("Largest number is: "+largest(numbers));
        
    }
}
