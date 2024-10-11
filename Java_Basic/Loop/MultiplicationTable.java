import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int i = 1;
        while(i <= 10) {
            System.out.println("%d X %d = %d".formatted(num, i, num * i));
            i++;
        }
    }
}
