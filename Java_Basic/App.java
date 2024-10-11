import java.util.Scanner;

public class App {

    static int calculateCommission(int sales, int commissionRate) {
        return (sales * commissionRate) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the sales value (or enter -1 to exit): ");
            int salesValue = sc.nextInt();

            if (salesValue == -1) {
                System.out.println("Exiting the application.");
                break;
            }

            int commissionValue = 0;

            if (salesValue > 10000) {
                System.out.println("***********************************************");
                System.out.println("Your sales value commission is 30%");
                commissionValue = calculateCommission(salesValue, 30);
            } else if (salesValue >= 5001 && salesValue <= 9999) {
                System.out.println("***********************************************");
                System.out.println("Your sales value commission is 20%");
                commissionValue = calculateCommission(salesValue, 20);
            } else if (salesValue >= 1001 && salesValue <= 4999) {
                System.out.println("***********************************************");
                System.out.println("Your sales value commission is 10%");
                commissionValue = calculateCommission(salesValue, 10);
            } else if (salesValue < 1000 && salesValue >= 0) {
                System.out.println("***********************************************");
                System.out.println("No commission for sales below $1000.");
                commissionValue = 0;
            } else {
                System.out.println("Invalid sales value entered.");
                continue;
            }

            System.out.println("Commission amount is: $" + commissionValue);
            System.out.println("************************************************");
        }
    }
}
