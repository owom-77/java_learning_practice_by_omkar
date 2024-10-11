public class RotateLeft {  
    public static void main(String[] args) {  

        int[] arr = {1, 2, 3, 4, 5};  
        int n = 3;  
        
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        
        for (int i = 0; i < n; i++) {  
            int first = arr[0];  

            for (int j = 0; j < arr.length-1; j++) {  
                arr[j] = arr[j + 1];  
            }  
            arr[arr.length - 1] = first;  
        }  
        
        System.out.println("\nArray after left rotation: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}
