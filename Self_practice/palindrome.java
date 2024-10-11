import java.util.Scanner;

public class palindrome {

    void pal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int digit = 0;
        int rm;
        int temp = num;

        while(num > 0){
            rm  = num % 10;
            digit = (digit * 10) + rm;
            num/= 10;
        }
        if(temp == digit){
            System.out.println("%d is palindrome".formatted(temp));
        }else{
            System.out.println("%d is not palindrome".formatted(temp));
        }   
    }

    public static void main(String[] args) {
        palindrome pl = new palindrome();
        pl.pal();
    }
}
