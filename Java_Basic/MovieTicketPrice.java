import java.util.Scanner;

public class MovieTicketPrice {

    static int calculateDiscount(int price, int discountPercentage) {
        return (price * discountPercentage) / 100; 
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        int ticketValue = 7; 
        int finalPrice; 

        if (age < 5) {
            System.out.println("You have a 60% discount.");
            int discount = calculateDiscount(ticketValue, 60);
            finalPrice = ticketValue - discount;
            System.out.printf("Discount is: %d Euros%n", discount);
        }
         else if (age >= 60) {
            System.out.println("You have a 55% discount.");
            int discount = calculateDiscount(ticketValue, 55);
            finalPrice = ticketValue - discount;
            System.out.printf("Discount is: %d Euros%n", discount);
        } 
        else {
            System.out.println("No discount is available for your age.");
            finalPrice = ticketValue;
        }

        System.out.printf("Final ticket price is: %d Euros%n", finalPrice);
        
    }
}
