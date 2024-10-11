import java.util.Scanner;

public class factorial {
    Scanner sc = new Scanner(System.in);

    void facto(){
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int fact = 1;

        for(int i=1;i<=num;i++){
            fact *= i;
        }
        System.out.println("The factorial of %d is %d".formatted(num,fact));
    }

    public static void main(String[] args) {
        factorial fact = new factorial();
        fact.facto();
    }
}
