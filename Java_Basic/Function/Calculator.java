import java.util.Scanner;

public class Calculator {

    private static int addition(int num1,int num2){
        return num1 + num2;
    }

    private static int subtraction(int num1,int num2){
        return num1 - num2;
    }

    private static int multiplication(int num1,int num2){
        return num1 * num2;
    }

    private static int division(int num1,int num2){
        if(num2 == 0){
            return -1;
        }else{
            return num1 / num2;
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        
        System.out.println("Addtion is: "+ addition(num1, num2));
        System.out.println("Subtraction is: "+subtraction(num1, num2));
        System.out.println("Multiplication is: "+multiplication(num1, num2));
        System.out.println("Division is: "+division(num1, num2));
    }   
}
