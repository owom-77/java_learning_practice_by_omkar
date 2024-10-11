import java.util.Scanner;

public class Another_multi {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int num = sc.nextInt();

        int i = 1;
        while (i <= num) { 

            int j = 1;
            while (j <= 10) { 
                System.out.println("%d X %d = %d".formatted(i, j, i * j));
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
