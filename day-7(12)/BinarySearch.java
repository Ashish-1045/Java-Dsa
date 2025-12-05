public class BinarySearch {

    public static int bs(int num[], int key){
        int start = 0, end = num.length -1;
        int mid = (start+end )/2;
        while(start <= end){
           if(num[mid] == key ){
            return mid;
           }
              if(num[mid] < key){
                start = mid + 1;
              } else {
                end = mid - 1;
              }
              mid = (start+end )/2;

        }
        return -1;
    }
    
  public static void main(String[] args){
     int num[] = {2,4,6,8,10,12,14,16,18,20};
     int key = 14;

        int index = bs(num, key);
        if(index == -1){
            System.out.println("Not found");
        } else {
            System.out.println("Key found at index: "+index);
        }
  }



};
