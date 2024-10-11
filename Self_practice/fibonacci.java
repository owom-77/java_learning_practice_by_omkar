public class Fibonacci {

    void fibo(int count) {
        int num1 = 0;
        int num2 = 1;
        int[] arr = new int[count];

        if (count > 0) {
            arr[0] = num1;
        }
        if (count > 1) {
            arr[1] = num2;
        }

        int i = 2;
        while (i < count) {
            int n3 = num1 + num2;
            num1 = num2;
            num2 = n3;
            arr[i] = n3;
            i++;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println("array[" + j + "] = " + arr[j]);
        }
    }

    public static void main(String[] args) {
        Fibonacci fico = new Fibonacci();
        fico.fibo(10);
    }
}
