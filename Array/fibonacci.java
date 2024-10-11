public class fibonacci {

    void fibo(int count){
        int num1 = 0;
        int num2 = 1;
        int[] arr = new int[count]; 
        arr[0] = num1;
        arr[1] = num2;
        
        for (int i = 2; i < count; i++) {
            int n3 = num1 + num2;
            num1 = num2;
            num2 = n3;
            arr[i] = n3;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println("array[" + i + "] = " + arr[i]);
        }
    }

    public static void main(String[] args) {
        fibonacci fico = new fibonacci();
        fico.fibo(10);
    }
}
