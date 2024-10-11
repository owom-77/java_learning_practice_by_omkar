import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Waits for user input
        
        System.out.println("You entered: " + num);
        
        sc.close(); // Close the scanner
    }
}
