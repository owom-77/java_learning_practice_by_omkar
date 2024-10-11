class Array {

    int[] array;
    int[] even = new int[20];

    void fibonacci(int[] array) {
        this.array = new int[array.length];
        int num1 = 0, num2 = 1;

        for (int i = 0; i < array.length; i++) {
            this.array[i] = num1;
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

            if (this.array[i] % 2 == 0) {
                even[i] = this.array[i];
            }
        }

        System.out.println("Even Fibonacci numbers:");
        for (int i = 0; i < even.length; i++) {
            if (even[i] != 0) {
                System.out.println("even[%d] = %d".formatted(i, this.even[i]));
            }
        }
    }

    void sum() {
        int sum = 0;
        for (int i = 0; i < this.array.length; i++) {
            sum += this.array[i];
        }
        System.out.println("Sum of Fibonacci numbers: " + sum);
    }

    void display() {
        System.out.println("Fibonacci numbers:");
        for (int i = 0; i < this.array.length; i++) {
            System.out.println("fibo[%d] = %d".formatted(i, this.array[i]));
        }
    }
}

public class pract {
    public static void main(String args[]) {
        Array arr = new Array();

        int[] arr1 = new int[20];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }

        arr.fibonacci(arr1);
        arr.sum();
        arr.display();
    }
}
