public class pract_binaray {

   static int bs(int arr [],int key){
        int first = 0;
        int end = arr.length-1;     //value is 4

        while(first <= end){
            int mid = (first + end) /2;     // mid = 2    arr[mid] = 4

            if(arr[mid] == key){        
                return mid;
            }
            else if(arr[mid] < key){
                first = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
   }

    public static void main(String args[]){
        int arr [] = {2,3,4,5,61};
        int key = 5;

        int result = bs(arr, key);

        if(result == -1){
            System.out.println("Value is not found");
        }else{
            System.out.println("Value is found in index %d".formatted(result));
        }
    }
}
