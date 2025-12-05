// public class linearSearch {

//     public static int search(int number[], int key){
//         for(int i = 1 ; i<number.length; i++){
//           if(key == number[i]){
//             return i ;
//           }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int number[] = {22,33,44,55,66,77,88};
//         int key = 77;
//         int index = search(number, key);
//         if(index == -1){
//             System.out.println("Not found");
//         } else {
//             System.out.println("Key found at index: "+index);
//         }

//     }

// }



public class linearSearch{

    public static int search(String fruits[], String key){
        for(int i = 1; i <fruits.length; i++){
            if(key == fruits[i]){
                return i;
            }
        }
        return -1;
    }
    

    public static void main(String[] args){
        String fruits[] = {"apple", "banana", "mango", "grapes"};
        String key = "mango";
        int index = search(fruits,key);
         
        if(index == -1){
            System.out.println("Not found");
        } else {
            System.out.println("Key found at index: "+index);
        }
        
    }
}